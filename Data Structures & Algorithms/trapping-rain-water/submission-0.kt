class Solution {
    fun trap(height: IntArray): Int {
        val len = height.size 
        var res = 0
        if(len == 0) return 0 
        for(i in height.indices){
            var h = height[i]
            var leftmax = h
            for(j in i - 1 downTo 0){
                if(height[j] > leftmax) leftmax = height[j]
            }
            var rightmax = h
            for(k in i + 1 until len){
                if(height[k] > rightmax) rightmax = height[k]
            }
            res = res + minOf(leftmax,rightmax) - h 
        }
        return res 
    }
}
//time complexity O(n^2) space complexity O(1)

/* pseudocode
1. if array is empty return 0 
2. let n be the length of the array and initialize res = 0 
3. for each index i : 
    compute leftmax by scanning from 0 to i 
    compute rightmax by scanning from index i+1 to the end 
    add min(leftmax, rightmax) -height[i] to res 
4. after processing all positions return res */
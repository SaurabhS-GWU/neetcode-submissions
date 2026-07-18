class Solution {
    fun trap(height: IntArray): Int {
        //solving with prefix/suffix arrays approach
        //since for every index we want leftmax and rightmax this is a more efficient and cleaner approach.

        val n = height.size 
        if(n == 0) return 0 
        var leftMax = IntArray(n)
        var rightMax = IntArray(n)
        var res = 0
        //calculate leftmax
        leftMax[0] = height[0]
        rightMax[n-1] = height[n-1]
        for(i in 1 until n){
            leftMax[i] = maxOf(leftMax[i - 1], height[i])
        }
        for(j in n-2 downTo 0){
            rightMax[j] = maxOf(rightMax[j + 1], height[j])
        }
        for(k in height.indices){
            res = res + minOf(leftMax[k], rightMax[k]) - height[k]
        }
        return res
    }
}

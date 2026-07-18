class Solution {
    fun trap(height: IntArray): Int {
        if(height.isEmpty()) return 0 
        var l = 0 
        var r = height.size - 1 
        var leftMax = height[l]
        var rightMax = height[r]
        var res = 0 
        while(l < r){
            if(leftMax < rightMax){
                l += 1 
                leftMax = maxOf(leftMax, height[l])
                res += leftMax - height[l]
            }else{
                r -= 1
                rightMax = maxOf(rightMax, height[r])
                res += rightMax - height[r]
            }
        }
        return res

    }
}
//two pointer solution
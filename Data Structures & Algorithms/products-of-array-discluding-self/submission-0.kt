class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        if(nums.size == 0) return IntArray(0) 
        val result = IntArray(nums.size)
        for(i in nums.indices){
            var prod = 1 
            for(j in nums.indices){
                if(j != i){
                    prod  = prod * nums[j]
                }
            }
            result[i] = prod 
        }
        return result 
    }
}

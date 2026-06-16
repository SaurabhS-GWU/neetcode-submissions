class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        //keep in mind different conditions when one or more elements are zero. 
        //use division as a tool. 
        var zeroCount = 0
        var product = 1
        var result = IntArray(nums.size)
        for(num in nums){
            if(num == 0) zeroCount++ 
            else product = product * num
        }

        if(zeroCount > 1) return result 
        for(i in nums.indices){
            if(zeroCount == 1){
                if(nums[i] == 0) result[i] = product 
                else result[i] = 0
            }else{
                result[i] = product/nums[i]
            }  
         }
         return result 

    }
}

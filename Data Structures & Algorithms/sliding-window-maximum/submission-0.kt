class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val resList = mutableListOf<Int>()       
         // Brute force 
         for(i in 0..nums.size - k){
            var max = Integer.MIN_VALUE
            for(j in i until i+k){
                if(nums[j] > max) max = nums[j]
            }
            resList.add(max)
         }
         return resList.toIntArray()
    }
}

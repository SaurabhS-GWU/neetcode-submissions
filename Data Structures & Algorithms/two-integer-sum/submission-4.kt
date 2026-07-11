class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for(i in nums.indices){
            val diff = target - nums[i]
            if(map.containsValue(diff)){
                val targetIndex = map.entries.first{ it.value == diff }.key 
                return intArrayOf(targetIndex, i)
            }
            map[i] = nums[i]
        }
        return intArrayOf()
    }
}

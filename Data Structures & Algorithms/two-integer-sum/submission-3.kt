class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var possibleMaps = HashMap<Int, Int>()
        for(i in nums.indices){
            possibleMaps[nums[i]] = i
        }
        for(i in nums.indices){
            var match = target - nums[i]
            if(possibleMaps.containsKey(match) && possibleMaps[match]!! != i){
                return intArrayOf(i, possibleMaps[match]!!)
            }
        }
        return intArrayOf()
    }
}

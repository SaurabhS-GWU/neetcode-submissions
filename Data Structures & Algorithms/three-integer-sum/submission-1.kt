class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        //Brute force approach O(n^3) time complexity space complexity O(1) no extra space used
        var res = HashSet<List<Int>>() //to prevent duplicates 
        nums.sort() 
        for(i in nums.indices){
            for(j in i+1 until nums.size){
                for(k in j+1 until nums.size){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        res.add(listOf(nums[i],nums[j] , nums[k]))
                    }
                }
            }
        }
        return res.map{it.toList()}
    }
}

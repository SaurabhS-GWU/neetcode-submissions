class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    
        val map = mutableMapOf<Int, Int>()
        for(i in nums.indices){
            val ele = nums[i]
            var diff = target - ele
            if(map.contains(diff)) return intArrayOf(map[diff]!!, i)
            else map[ele] = i
        }
        return intArrayOf()
    }
}
//Clarifying questions. 
// is it okay to sort the array? I believe this question is unnecessary. 
// can nums be empty? Are there any space and time constraints on this problem. 
//if its okay to use a map we can use a hashmap to run over the array and check if target is found. 

//brute force approach is using two for loops to go over every element and over rest of array to see if it reaches target. 
//map approach is to add the elements to the map with thier indices
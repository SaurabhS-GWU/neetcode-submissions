class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        var numset = nums.toSet()
        var longest = 0 
        for(num in numset){
            //adding num-1 check because if n-1 exists then we already have 
            //larger subsequence 
            if(num - 1 !in numset ){
                var length = 1 
                while((num + length) in numset){
                    length++ 
                }
                longest = maxOf(longest, length)
            }
        }
        return longest
    }
}

//using hashset 
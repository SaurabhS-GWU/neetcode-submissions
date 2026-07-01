class Solution {
    //consecutive meaning a and b are cons if a + 1 = b 
    //hence if any number had its a+1 available only then the number increases.
    fun longestConsecutive(nums: IntArray): Int {
       var res = 0 
       var unique = nums.toSet() 
       var curr = 0 
       for(num in nums){
            var streak = 0
            curr = num
            while(curr in unique){
                curr++ 
                streak++
            }
            res = maxOf(res,streak)
       }
       return res
    }
}

class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>() 
        for(a in nums){
            if(set.contains(a)) return true 
            set.add(a)
        }
        return false
    }
}

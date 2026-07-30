class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length > s2.length) return false 
        var sortedS1 = s1.toCharArray().sorted().joinToString() 

        for(i in s2.indices){
            var j = s1.length + i
            if(j > s2.length) return false
            var sub2 = s2.substring(i, j).toCharArray().sorted().joinToString() 
            if(sortedS1 == sub2) return true 
        }
        return false 
    }
}
//Time complexity is O(m.nlogn) 
// nlogn 
// + m.nlogn
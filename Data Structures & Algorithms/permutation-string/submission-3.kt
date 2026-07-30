class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        var s1Count = mutableMapOf<Char, Int>() 
     
        var curr = 0
        for(s in s1) {
            s1Count[s] = s1Count.getOrDefault(s, 0) + 1 
        }
        var need = s1Count.size 
        for(i in s2.indices){
            var s2Count = mutableMapOf<Char, Int>() 
            var curr = 0
            for(j in i until s2.length){
                s2Count[s2[j]] = s2Count.getOrDefault(s2[j], 0) + 1 
                if(s2Count[s2[j]]!! > s1Count.getOrDefault(s2[j],0)) break 
                if(s2Count[s2[j]]!! == s1Count.getOrDefault(s2[j],0)) curr++ 
                if(need == curr) return true 

            }
        }
      
        return false 
    }
}

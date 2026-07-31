class Solution {
    fun minWindow(s: String, t: String): String {
        var tCount = mutableMapOf<Char, Int>() 
        for(ti in t){
            tCount[ti] = tCount.getOrDefault(ti, 0) + 1
        }
        var minLen = Integer.MAX_VALUE 
        
        var indices = IntArray(2){-1}
        for(i in s.indices){
            var sCount = mutableMapOf<Char, Int>() 
            for(j in i until s.length){
                sCount[s[j]] = sCount.getOrDefault(s[j],0) + 1
                var flag = true
                for(c in tCount.keys){
                    if(tCount[c]!! > sCount.getOrDefault(c,0)){
                        flag = false
                        break
                    }
                }
                if(flag && (j - i + 1) < minLen){
                    minLen = j - i + 1
                    indices[0] = i
                    indices[1] = j
                }
            }
        }
         return if(indices[0] == -1) "" else s.substring(indices[0], indices[1]+1)
    }
}


/* 
Basic plan is creating a hashmap of characters of t and go over all possible substrings in t comparing the hashmaps. 
Whenever there is a hashmap that matches hashmap of characters of s and if there is a minlen lesser than hashmap
then we store indices and the minlen. 

*/
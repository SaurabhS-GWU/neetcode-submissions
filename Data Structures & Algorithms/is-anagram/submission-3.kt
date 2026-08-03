class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        //HashMap approach 
        if(s.length != t.length) return false
        val mapS = mutableMapOf<Char, Int>()
        for(i in s.indices){
            mapS[s[i]] = mapS.getOrDefault(s[i], 0) + 1
        } 
        for(j in s.indices){
            mapS[t[j]] = mapS.getOrDefault(t[j], 0) - 1
        }
        for(k in mapS.keys){
            if(mapS[k] != 0) return false
        }
        return true 
    }
}

//clarifications. what are the space constraints for this problem? Is it okay to use a hashmap? Can one of the strings be empty? I am assuming if lengths are different then it should be false. Can strings have special characters? 

//second approach is sort the two strings and check if they are equal. 
//sorting takes Onlogn and O(1) space 
//Another approach is maintaining count of characters in a 26 digit array. 
//that can be completed with one for loop iteration over the strings increasing count for s and decreasing for t. then going over array to make sure coutns are 0 
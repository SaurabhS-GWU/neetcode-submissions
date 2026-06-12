class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        //Brute force approach 
        //go over every element in the array. 
        //for every element check if its an anagram for another element 
        //add it to a map for any element it is an anagram to 
        val result = mutableListOf<List<String>>()
        val visited = BooleanArray(strs.size)
        for(i in strs.indices){
            if(visited[i]) continue 
            var group = mutableListOf<String>()
            group.add(strs[i])
            visited[i] = true 
            for(j in i+1 until strs.size){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    visited[j] = true
                    group.add(strs[j])
                } 
            }
            result.add(group)
        }
        return result
    }

    fun isAnagram(str1: String, str2: String):Boolean{
        if(str1.length != str2.length) return false
        var charArray = IntArray(26)
        for(i in str1.indices){
            charArray[str1[i] - 'a']++
            charArray[str2[i] - 'a']-- 
        }
        for(i in charArray){
            if(i != 0) return false
        }
        return true 
    }
}

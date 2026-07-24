class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var strMap = mutableMapOf<Char, Int>()
        var res = 0 
        var l = 0 
        for(r in s.indices){
            if(s[r] in strMap){
                l = maxOf(strMap[s[r]]!! +1, l) 
            }
            strMap[s[r]] = r
            res = maxOf(res, r - l + 1)
        } 
        return res 
    }
}

// try to solve witha. map
//store the characters with thier last appearances into map. 

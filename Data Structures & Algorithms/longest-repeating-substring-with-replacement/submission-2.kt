class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var count = mutableMapOf<Char, Int>() 
        var l = 0 
        var maxF = 0 
        var res = 0 
        for(i in s.indices){
            count[s[i]] = count.getOrDefault(s[i]!!, 0) + 1 
            maxF = maxOf(maxF, count[s[i]]!!)

            while((i - l + 1) - maxF > k){
                count[s[l]] = count[s[l]]!! - 1 
                l++
            } 

            res = maxOf(res, i-l+1)
        }
        return res 
    }
    
}


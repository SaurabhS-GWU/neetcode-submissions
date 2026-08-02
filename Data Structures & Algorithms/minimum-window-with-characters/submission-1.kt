class Solution {
    fun minWindow(s: String, t: String): String {
        var countT = mutableMapOf<Char, Int>() 
        for(ch in t){
            countT[ch] = countT.getOrDefault(ch, 0) + 1 
        }
        val need = countT.size //stores distinct keys in T 
        var have = 0 
        var resLen = Integer.MAX_VALUE
        var indices = IntArray(2){-1}
        var l = 0 
        var window = mutableMapOf<Char, Int>()
        for(i in s.indices){
            window[s[i]] = window.getOrDefault(s[i], 0) + 1 
            if(window[s[i]] == countT[s[i]]?: 0) have++ 
            while(have == need){
                if((i - l + 1) < resLen) {
                    resLen = i - l + 1
                    indices[0] = l
                    indices[1] = i 
                }
                window[s[l]] = window.getOrDefault(s[l],0) - 1 
                if(countT.containsKey(s[l]) && countT[s[l]]!! > (window[s[l]] ?: 0)) have--          
                l++
            }
        }
        return if(indices[0] == -1) "" else s.substring(indices[0], indices[1]+ 1)

    }
}


//first create a frequency map for t.and set need which is distinct chars
//next create a window intended to store s frequency map matching with t
//then start a loop from 0 until s.length 
// for each step add a element to window, update have 
//keep l at 0 and when have == need try to keep shrinking the window and updating the reslen and indices which are stored in a two length array
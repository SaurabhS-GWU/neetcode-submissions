class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var res = 0 
        for(i in s.indices) {
            val count = HashMap<Char, Int>()
            var maxf = 0 
            for(j in i until s.length){
                count[s[j]] = count.getOrDefault(s[j], 0) + 1 
                maxf = maxOf(maxf, count[s[j]]!!)
                if((j - i + 1) - maxf <= k) {
                    res = maxOf(res, j - i + 1)
                } 

            }
        }
        return res
    }
}

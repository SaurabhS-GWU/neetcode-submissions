class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxCount = 0 
        for(c in s.indices){
            var j = c+1
            var charSet= mutableSetOf<Char>()
            charSet.add(s[c])
            while(j < s.length && !charSet.contains(s[j])){
                charSet.add(s[j])
                j++
            }
            maxCount = maxOf(maxCount, charSet.size)
        }
        return maxCount
    }
}
//above code needs cleanup 
//one wrong step was to compare with only first char of substring 
//at every step we need to make sure there are no repeated characters 


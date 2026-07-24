class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxCount = 0 
        for(c in s.indices){
            var count = 1
            var j = c+1
            var charSet= mutableSetOf<Char>()
            charSet.add(s[c])
            while(j < s.length && !charSet.contains(s[j])){
                count++
                charSet.add(s[j])
                j++
            }
            maxCount = maxOf(maxCount, count)
        }
        return maxCount
    }
}
//above code needs cleanup 
//one wrong step was to compare with only first char of substring 


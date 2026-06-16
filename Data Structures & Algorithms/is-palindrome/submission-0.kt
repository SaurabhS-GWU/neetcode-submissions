class Solution {
    fun isPalindrome(s: String): Boolean {
        //we can solve using two pointer 
        //take care of case sensitivity and special chars
        var str = s.toCharArray()
        var last = str.size - 1 
        var first = 0 
        while(first < last){
            while(last > first && !str[last].isLetterOrDigit()) last--
            while(first < last && !str[first].isLetterOrDigit()) first++
            if(str[last].lowercase() != str[first].lowercase()) return false 
            last-- 
            first++
        }
        return true 
    }
}

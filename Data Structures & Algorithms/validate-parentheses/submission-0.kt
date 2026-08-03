class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>() 
        var mapping = hashMapOf(')' to '(', ']' to '[', '}' to '{')

        for(c in s){
            //check if its a closing bracket i.e. keys
            if(c in mapping){
                if(stack.isNotEmpty() && stack.first() == mapping[c]){
                    stack.removeFirst()
                }else{
                    return false
                }
            }else{
                stack.addFirst(c)
            }
        }
        return stack.isEmpty()
    }
}

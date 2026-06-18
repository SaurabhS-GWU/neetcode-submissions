class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val mp = HashMap<Int, Int>() 
        for(i in numbers.indices){
            val diff = target - numbers[i] 
            if(mp.containsKey(diff)){
                return intArrayOf(mp[diff]!!, i + 1)
            }
            mp[numbers[i]] = i + 1
        }
        return intArrayOf()
    }
}

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        //Step 1: Create frequency map O(n) time complexity
        //Step 2: Put the frequencies in a List of Pairs so we can sort it. 
        //Step 3: Iterate through the list of pairs and add elements to result array of size k
        var freqMap = HashMap<Int, Int>()
        for(num in nums){
           freqMap[num] = freqMap.getOrDefault(num,0) + 1 
        }

        var freqList = mutableListOf<Pair<Int, Int>>()
        for((num, freq) in freqMap){
            freqList.add(Pair(num,freq))
        }
        freqList.sortByDescending{it.second} //Here is how list is sorted in descending order
        var result = IntArray(k) // this is how you initialize array of size k
        for(i in 0 until k){
            result[i] = freqList[i].first
        }
        return result 

    }
}

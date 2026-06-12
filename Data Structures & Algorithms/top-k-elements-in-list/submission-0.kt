class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var freqMap = HashMap<Int, Int>()
        for(num in nums){
           freqMap[num] = freqMap.getOrDefault(num,0) + 1 
        }
        var freqList = mutableListOf<Pair<Int, Int>>()
        for((num, freq) in freqMap){
            freqList.add(Pair(num,freq))
        }
        freqList.sortByDescending{it.second} 
        var result = IntArray(k)
        for(i in 0 until k){
            result[i] = freqList[i].first
        }
        return result 

    }
}

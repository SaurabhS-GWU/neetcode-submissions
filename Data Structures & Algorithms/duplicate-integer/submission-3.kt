class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var map = mutableMapOf<Int, Int>() 
        for(i in nums){
            if(i in map) return true
            else map[i] = map.getOrDefault(i,0) + 1
        }
        return false 
    }
}

// this is a hashmap problem 
//go over the elements of the array 
// if(hashMap contains ele) return false 
//else add to the hashmap with count
//O(n) and O(n)

//brute force solution is for loop 
//and another for loop that goes from i + 1 to n checking if anything is repeated. 
//O(n^2) and O(1)

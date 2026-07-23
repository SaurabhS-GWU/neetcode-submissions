class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0 
        for(i in prices.indices){
            for(j in i+1 until prices.size){
                var profit = prices[j] - prices[i]
                maxProfit = maxOf(maxProfit, profit)
            }
        }
        return maxProfit 
    }
}


//trying to make maximum profit. 
//goal is to find lowest price price[i] followed by highest 
//price[i] 
//I am assuming prices cannot be negative am I correct. 
//what to return if array is empty ? 
//sorting is not suitable as it loses the order 
//Since this is two for loops inside each other time complexity is O(n^2)
//Space complexity is O(1)
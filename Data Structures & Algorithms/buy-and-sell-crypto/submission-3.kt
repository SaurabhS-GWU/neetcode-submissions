class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minBuyAmount = Integer.MAX_VALUE 
        var maxProfit = 0 
        for(price in prices){
            maxProfit = maxOf(maxProfit, price-minBuyAmount)
            minBuyAmount = minOf(price, minBuyAmount)
        }
        return maxProfit 
    }
}
//lets try dynamic programming too 

//always keep track of the minBuyAmount. 
//at every point profit will be currentBuy - minBuy 
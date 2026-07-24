class Solution {
    fun maxProfit(prices: IntArray): Int {
        var l = 0 
        var r = l+1
        var maxProfit = 0 
        while(r < prices.size){
            var buyPrice = prices[l]
            var sellPrice = prices[r]
            if(buyPrice > sellPrice){
                l = r
            }else{
                maxProfit = maxOf(maxProfit, sellPrice  - buyPrice)
            }
            r++
        }

        return maxProfit
    }
}
//do a dry run 
//Time Complexity = O(n)

//another approach is to solve it using two pointers
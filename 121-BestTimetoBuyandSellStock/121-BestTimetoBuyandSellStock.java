// Last updated: 5/24/2025, 12:16:25 AM
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int buy = 0;
        int sell = 1;

        while(sell<prices.length){
            if(prices[sell] > prices[buy]){
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}
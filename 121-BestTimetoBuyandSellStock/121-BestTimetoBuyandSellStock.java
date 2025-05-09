// Last updated: 5/9/2025, 5:57:44 PM
class Solution {
    public int maxProfit(int[] prices) {
        int left =0;
        int right = 1;
        int maxP = 0;
        while ( right < prices.length){
            if(prices[left] < prices[right]){
               int profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
            }
            else{
                left = right;
            }
             right += 1;
        }
        return maxP;
    }
}
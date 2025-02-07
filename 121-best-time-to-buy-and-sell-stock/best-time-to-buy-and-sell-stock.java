
class Solution {
    // Tc=O(n) bruitforce sol;ution
    public int maxProfit(int[] prices) {
        // initial my profit is 0
        int profit = 0;
        int mini = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int mindiff = prices[i] - mini; // min profit
            profit = Math.max(profit, mindiff);
            mini = Math.min(mini, prices[i]);// get the min value for next profit
        }
        return profit;

    }
    //Now will do optimazation using DP
}
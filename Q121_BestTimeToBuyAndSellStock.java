public class Q121_BestTimeToBuyAndSellStock {
    // Method 1 192ms 30.81%
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                res = prices[j] - prices[i] > res ? prices[j] - prices[i] : res;
            }
        }
        return res;
    }

    // Method 1 1ms 100%
    public int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else {
                int profit = prices[i] - minPrice;
                maxProfit = maxProfit > profit ? maxProfit : profit;
            }
        }
        return maxProfit;
    }
}

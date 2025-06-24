import java.util.Arrays;

class Solution {
    public int maximumProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}

public class BuySellStockI {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {1, 5, 3, 8, 4, 9};
        System.out.println(sol.maximumProfit(prices)); // Output: 14
    }
}

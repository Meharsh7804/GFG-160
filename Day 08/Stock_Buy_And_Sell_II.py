class Solution:
    def maximumProfit(self, prices):
        min_price = prices[0]
        max_profit = 0
        
        for i in range(1, len(prices)):
            if prices[i] < min_price:
                min_price = prices[i]
            
            profit = prices[i] - min_price
            if profit > max_profit:
                max_profit = profit
        
        return max_profit

if __name__ == "__main__":
    prices = [7, 1, 5, 3, 6, 4]
    sol = Solution()
    result = sol.maximumProfit(prices)
    print(f"Maximum Profit: {result}")

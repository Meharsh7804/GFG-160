# Multiple Transactions Allowed

class Solution:
    def maximum_profit(self, prices):
        profit = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i-1]:
                profit += prices[i] - prices[i-1]
        return profit

if __name__ == "__main__":
    sol = Solution()
    prices = [1, 5, 3, 8, 4, 9]
    print(sol.maximum_profit(prices))  # Output: 14
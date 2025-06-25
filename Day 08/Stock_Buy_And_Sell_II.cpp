#include <iostream>
#include <vector>
using namespace std;

class Solution {
    public:
      int maximumProfit(vector<int> &prices) {
          int minPrice = prices[0];
          int maxProfit = 0;
          for(int i = 1; i < prices.size(); i++){
              if(prices[i] < minPrice){
                  minPrice = prices[i];
              }
              int profit = prices[i] - minPrice;
              if(profit > maxProfit){
                  maxProfit = profit;
              }
          }
          
          return maxProfit;
      }
  };

int main() {
    vector<int> prices = {7, 1, 5, 3, 6, 4};
    Solution sol;
    int result = sol.maximumProfit(prices);
    cout << "Maximum Profit: " << result << endl;
    return 0;
}
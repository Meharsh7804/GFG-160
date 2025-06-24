// Multiple Transactions Allowed
#include <iostream>
#include <vector>
using namespace std;

class Solution {
  public:
    int maximumProfit(vector<int> &prices) {
        int profit = 0;
        for(int i = 1; i < prices.size(); i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
        
    }
};

int main() {
    Solution sol;
    vector<int> prices = {1, 5, 3, 8, 4, 9};
    cout << sol.maximumProfit(prices) << endl; // Output: 14
    return 0;
}


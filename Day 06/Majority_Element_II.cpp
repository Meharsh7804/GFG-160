#include <iostream>
#include <vector>
using namespace std;

class Solution {
    public:
      // Function to find the majority elements in the array
      vector<int> findMajority(vector<int>& arr) {
          vector<int> result;
          int n = arr.size();
          map<int, int> mp;
          for(int i = 0; i < n; i++){
              mp[arr[i]]++;
          }
          for(auto it:mp){
              if(it.second > n/3)
                  result.push_back(it.first);
          }
          return result;
      }
  };

int main() {
    vector<int> arr = {3, 2, 3, 2, 2, 1, 1};
    Solution sol;
    vector<int> res = sol.findMajority(arr);
    for(int num : res) {
        cout << num << " ";
    }
    cout << endl;
    return 0;
}
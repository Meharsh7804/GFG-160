
#include <iostream>
#include <vector>
using namespace std;

class Solution {
    public:
      void pushZerosToEnd(vector<int>& arr) {
          // code here
          int count = 0;
          for(int i=0; i < arr.size(); i++){
              if(arr[i]!=0)
                  arr[count++] = arr[i];
          }
          while(count < arr.size()){
              arr[count++] = 0;
          }
      }
  };

int main() {
    vector<int> arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
    Solution sol;
    sol.pushZerosToEnd(arr);
    for (int num : arr) {
        cout << num << " ";
    }
    cout << endl;
    return 0;
}
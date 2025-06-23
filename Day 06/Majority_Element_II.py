from typing import List

class Solution:
    # Function to find the majority elements in the array
    def find_majority(self, arr: List[int]) -> List[int]:
        result = []
        n = len(arr)
        count_map = {}
        
        # Count occurrences of each element
        for num in arr:
            count_map[num] = count_map.get(num, 0) + 1
        
        # Find elements with count > n/3
        for num, count in count_map.items():
            if count > n // 3:
                result.append(num)
                
        return result


if __name__ == "__main__":
    arr = [3, 2, 3, 2, 2, 1, 1]
    sol = Solution()
    res = sol.find_majority(arr)
    
    print(" ".join(map(str, res)))
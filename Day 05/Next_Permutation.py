# NextPermutation.py

class Solution:
    def nextPermutation(self, nums):
        n = len(nums)
        i = n - 2
        
        # Find first decreasing element from right
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
            
        if i >= 0:
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            self._swap(nums, i, j)
        
        # Reverse the subarray after position i
        self._reverse(nums, i + 1, n - 1)
    
    def _swap(self, nums, i, j):
        nums[i], nums[j] = nums[j], nums[i]
    
    def _reverse(self, nums, start, end):
        while start < end:
            self._swap(nums, start, end)
            start += 1
            end -= 1


if __name__ == "__main__":
    arr = [1, 2, 3]
    sol = Solution()
    sol.nextPermutation(arr)
    
    print(" ".join(map(str, arr)))
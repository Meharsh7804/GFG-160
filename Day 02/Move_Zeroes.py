class Solution:
    def pushZerosToEnd(self, arr):
        # code here
        count = 0
        for i in range(len(arr)):
            if arr[i] != 0:
                arr[count] = arr[i]
                count += 1
        
        while count < len(arr):
            arr[count] = 0
            count += 1

if __name__ == "__main__":
    arr = [0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9]
    sol = Solution()
    sol.pushZerosToEnd(arr)
    for num in arr:
        print(num, end=" ")
    print()
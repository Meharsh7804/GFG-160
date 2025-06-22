import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        
        // Find first decreasing element from right
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
            
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        
        // Reverse the subarray after position i
        reverse(nums, i + 1, n - 1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Solution sol = new Solution();
        sol.nextPermutation(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

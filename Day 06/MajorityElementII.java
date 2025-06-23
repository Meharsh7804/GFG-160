import java.util.*;

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
}

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 2, 2, 1, 1};
        Solution sol = new Solution();
        List<Integer> res = sol.findMajority(arr);
        
        for (int num : res) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
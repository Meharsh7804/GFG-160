import java.util.*;

class Solution {
    public void pushZerosToEnd(int[] arr) {
        // code here
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0)
                arr[count++] = arr[i];
        }
        while(count < arr.length){
            arr[count++] = 0;
        }
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        Solution sol = new Solution();
        sol.pushZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
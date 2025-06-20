public class ReverseArray {
    
    // Method to reverse an array in-place
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
    // Method to print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        System.out.println("Original array:");
        printArray(arr);
        
        reverseArray(arr);
        
        System.out.println("Reversed array:");
        printArray(arr);
    }
}
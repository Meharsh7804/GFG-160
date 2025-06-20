class ReverseArray:
    
    # Method to reverse an array in-place
    @staticmethod
    def reverse_array(arr):
        start = 0
        end = len(arr) - 1
        
        while start < end:
            # Swap elements
            arr[start], arr[end] = arr[end], arr[start]
            
            start += 1
            end -= 1
    
    # Method to print array
    @staticmethod
    def print_array(arr):
        for element in arr:
            print(element, end=" ")
        print()  # New line
    
    @staticmethod
    def main():
        arr = [1, 2, 3, 4, 5, 6]
        
        print("Original array:")
        ReverseArray.print_array(arr)
        
        ReverseArray.reverse_array(arr)
        
        print("Reversed array:")
        ReverseArray.print_array(arr)

# Run the main method
if __name__ == "__main__":
    ReverseArray.main()
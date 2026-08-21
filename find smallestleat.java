public class Main {
    public static int findSmallest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        System.out.println(findSmallest(arr));  // Output: 1
    }
}

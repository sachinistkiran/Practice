package temo;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {8, 6, 5, 1, 4, 3, 2, 7};
        int[] res = sortedArray(arr);

        // Print the sorted array
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
    public static int[] sortedArray(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        // Outer loop for each pass through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

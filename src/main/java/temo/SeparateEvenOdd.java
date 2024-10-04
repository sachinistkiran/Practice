package temo;

import java.util.Arrays;

public class SeparateEvenOdd {

    public static int[] separateEvenOdd(int[] arr) {
        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;
        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 1, 6, 4};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] result = separateEvenOdd(arr);
        System.out.println("Array after separating even and odd numbers: " + Arrays.toString(result));
    }
}


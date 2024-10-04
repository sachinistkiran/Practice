package temo;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 2};
        int len = arr.length;
        int max = 0;
        int sec = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] > max) {
                sec = max;
                max = arr[i];
            } else if (arr[i] > sec && arr[i] < max) {
                sec = arr[i];
            }
        }

        System.out.println("The second largest number is: " + sec);
    }
}


package temo;

public class maxSubArray {
    public static void main(String args[]) {
        int sum = 0;
       int arr[]= {1, 2, 6, 3, 4, 5, 6};
//        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}

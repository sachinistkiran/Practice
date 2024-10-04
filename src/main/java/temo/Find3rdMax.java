package temo;
import java.util.Arrays;

public class Find3rdMax {

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, -9, 10, -4};

        Find3rdMax obj = new Find3rdMax();
        System.out.println(obj.find3ax(arr));
        System.out.println(obj.find3rdMaxWithFunction(arr));
    }

    private int find3rdMaxWithFunction(int[] arr) {
        Arrays.sort(arr);
        return arr[(arr.length - 3)];
    }

    private int find3ax(int[] arr) {
        int fLargest = arr[0];
        int sLargest = arr[1];
        int tLargest = arr[2];
        if (arr.length <= 2) {
            return fLargest;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (fLargest < arr[i]) {
                tLargest = sLargest;
                sLargest = fLargest;
                fLargest = arr[i];
            } else if (sLargest < arr[i]) {
                tLargest = sLargest;
                sLargest = arr[i];
            } else if (tLargest < arr[i]) {
                tLargest = arr[i];
            }
        }
        return tLargest;
    }
}
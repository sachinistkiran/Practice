package temo;
import java.lang.*;
public class Array_Rotation {

    // Function to rotate the array one step to the right
    static void rightRotateByOne(int a[], int n) {
        int last = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
    }
    static void rightRotate(int a[], int n, int k) {
        for (int i = 0; i < k; i++) {
            rightRotateByOne(a, n);
        }
        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 4, 5};
        int N = Array.length;
        int K = 2;
        rightRotate(Array, N, K);
    }
}

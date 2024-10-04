package temo;

import java.util.Arrays;

public class ProductofSelfArray {
    public static void main(String args[]) {
        int[] nums = {10, 2, 3, 4, 5};

        ProductofSelfArray obj = new ProductofSelfArray();
        ProductofSelfArray.calproduct(nums);
    }

    public static int[] calproduct(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = 1;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    res[i] *= nums[j];
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}

package temo;


public class maxProductSubarray {
    public static int maxProductSubarray(int[] nums) {

        int product = 1;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            if (max < product) {
                max = product;
            }
            if (product == 0) {
                product = 1;
            }
        }
        product = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            product *= nums[j];
            if (max < product) {
                max = product;
            }
            if (product == 0) {
                product = 1;
            }
        }
        return max;
    }
        public static void main (String[]args){
            int[] arr = {2,3,-2,4};
//        maxProductSubarray(arr);
            System.out.println(maxProductSubarray(arr));
        }

    }

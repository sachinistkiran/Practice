package temo;

import java.util.ArrayList;
import java.util.List;

public class SubArraySumEqualsK {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 1, 3};
        int k = 6;
        System.out.println(subarraySum(arr, k));
        System.out.println(subarraySum(arr,k).size());
    }

    private static List<List<Integer>> subarraySum(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=i; j<n; j++) {
                sum += arr[j];
                if(sum == k) {
                    List<Integer> list = new ArrayList<>();
                    for(int l=i; l<=j; l++) {
                        list.add(arr[l]);
                    }
                    result.add(list);
                }
            }
        }
        return result;
    }
}
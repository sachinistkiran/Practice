package org;

//Write a Program to find the maximum sum of a contiguous sub array
public class Sumoffcontsubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum>max){
                    max=sum;
                }
            }
            sum=0;
        }
        System.out.println(max);
    }
}

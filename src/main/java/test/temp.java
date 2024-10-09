package org;
//Write a Program to find the second-highest number in an array without sorting
public class temp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 1, 9};
        int max=arr[0];
        int secmax =0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    secmax=max;
                    max=arr[i];
                }
            }
            System.out.println(secmax);
    }

}
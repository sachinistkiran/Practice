package temo;

public class minimumInArray {
    public static void  main(String args[]) {
        int arr[] = {12, 14, 21, 10, 32};
//
//        int min = arr[0];
//        for(int i=0;i< arr.length;i++){
//            if(min>arr[i]){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);
//    }
        // ultimately result should be in a array only so we can get the index position value so using swap trying to solve
        int t = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
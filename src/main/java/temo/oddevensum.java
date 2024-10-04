package temo;

public class oddevensum {
    public static void main(String args[]){
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int even =0 ; int odd =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 ==0){
                even = even+arr[i];
            }else{
                odd = odd+arr[i];
            }
        }
        System.out.println("even sum"+even+"");
        System.out.println("odd sum"+odd+"");
    }
}

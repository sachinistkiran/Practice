package temo;

public class Stringreverse {
        public static void reverseString(String s){
            String rev="";
            int len=s.length();
            for(int i=len-1; i>=0; i--)
            {
                rev=rev+s.charAt(i);
            }
            System.out.println("reversestring is:"+""+rev);
        }


    public static void  main(String args[]){
            reverseString("kiran pokuri");
    }
}

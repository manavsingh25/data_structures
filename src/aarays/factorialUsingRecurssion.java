package aarays;

public class factorialUsingRecurssion {
    public static void main(String[] args) {
        /**    int n=5;
         int output=1;
         for(int i=n;i>0;i--)
         {
         output= output*i;
         }
         System.out.println(output);    */
        System.out.println(fact(0));
    }
    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }
}

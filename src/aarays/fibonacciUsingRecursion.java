package aarays;
/**
package arrays;
  * this is the code for fibonacci series using recursion
  * but the catch here is that when we try to find the
  * series for the large numbers then the computation is
  * much much greater than that of finding the fibonacci series
  * using a normal program without recursion
  *
  * // int n=10;
        for(int n=1;n<=35;n++)
    {
        System.out.println(fib(n));
    }
    //   System.out.println(fib(10));
}*/
public class fibonacciUsingRecursion {
     public static void main(String[] args) {
        int n = 10000;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++)
        {
            int c=(a+b);
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
/**
public class fff {
    public static int ffg(int n){

        if(n==2||n==1)
        {
            return(n-1);
        }
        return ffg(n-1)+ffg(n-2);
    }
    public static void main(String[] args) {
        System.out.println(ffg(21));
    }
}*/
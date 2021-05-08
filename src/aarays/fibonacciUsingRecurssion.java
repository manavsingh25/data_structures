package aarays;
 /**
  * this is the code for fibbonacco series using recirsion
  * but the catch here is that when we try to find the
  * series for the large numbers then the computation is
  * much much greater than that of finding the fibbonacci series
  * using a normal program without recursion
  *
  * // int n=10;
        for(int n=1;n<=35;n++)
    {
        System.out.println(fib(n));
    }
    //   System.out.println(fib(10));
}
    public static int fib(int n) {

        if (n == 2 || n == 1)
        {
            return (n - 1);
        }
        return fib(n - 1) + fib(n - 2);
    }
}*/
 public class fibonacciUsingRecurssion {
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


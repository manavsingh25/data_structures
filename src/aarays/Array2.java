package aarays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        /**  int a[]={1,1,2,2,5,7,9,4,6,8,4,3,3,65,7,8,9,9,5,4,3,2,2,2,2,2,2,2,2,2,3,3,3};
         int num=a[0];
         int count;
         int max=-999999;
         for (int i=0;i<a.length;i++){
         count=0;
         for(int j=0;j<a.length;j++){
         if(num==a[i]){
         count +=1;
         if(max<count){
         max=count;
         }
         }
         //                else
         //                    num++ ;
         }
         if(max==count){
         System.out.println(num);
         }
         }
         */



        /**     int b;
         int max=Integer.MIN_VALUE;
         int budget=60;
         int keywords[]={40,50,60};
         int drives[]={5,8,12};
         for (int i=0;i<keywords.length;i++) {
         for (int j = 0; j < drives.length; j++) {

         b=keywords[i]+drives[j];
         if(b<budget){
         if(max<b){
         max=b;
         }
         }
         }
         }
         System.out.println(max);

         */



/**
 int a1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 for (int i = 0; i < a1.length; i++) {
 for (int j = 0; j < ((a1.length - i) - 1); j++) {
 System.out.println("  ");
 System.out.println(a1[j]);

 }
 }

 */


/**
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//*/
//        int i,j;
//        int n=8;
//        for(i=0;i<=n;i++)
//        {
//            if(i==0 || i==n)
//                System.out.println("* * * * * *");
//            else
//                System.out.println("* 1 1 1 1 *");
//        }

//                int i,m=0,flag=0;
//                int n=2;
//                m=n/2;
//                if(n==0||n==1){
//                    System.out.println(n+" is not prime number");
//                }else{
//                    for(i=2;i<=m;i++){
//                        if(n%i==0){
//                            System.out.println(n+" is not prime number");
//                            flag=1;
//                            break;
//                        }
//                    }
//                    if(flag==0)  { System.out.println(n+" is prime number"); }
//                }


                int n1, n2, i, f1,f2;
                f1=f2=1;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter First number:");
                n1=sc.nextInt();
                System.out.println("Enter Second number:");
                n2=sc.nextInt();
                for(i=2; i<n1; i++)
                {
                    if(n1%i==0)
                    {
                        f1=0;
                        break;
                    }
                }
                for(i=2; i<n2; i++)
                {
                    if(n2%i==0)
                    {
                        f2=0;
                        break;
                    }
                }
                if(f1==1 && f2==1 && Math.abs(n1-n2)==2)
                {
                    System.out.println("Twin Prime Number");
                }
                else
                {
                    System.out.println("Not a Twin Prime Number");
                }
            
    }
}



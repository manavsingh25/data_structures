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

    }
}



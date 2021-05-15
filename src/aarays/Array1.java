package aarays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        int a1[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int a2[]={1,2,3,4,5,6,7,8,9,10,11,12,13};

        System.out.println("Array a1 before rotation");
        System.out.println(Arrays.toString(a1));

        System.out.println("Array a2 before rotation");
        System.out.println(Arrays.toString(a2));

        System.out.println("checking equality of given two arrays before rotation");
        System.out.println(Arrays.equals(a1,a2));

        /**
         *      left rotation of an given array
         */
        for(int i=0;i<8;i++){
            int temp=a1[a1.length-1];
            for(int j=a1.length-1;j>0;j--){

                a1[j]=a1[j-1];

            }
            a1[0]=temp;
        }
        System.out.println("Array after left rotation is :");

        System.out.println(Arrays.toString(a1));

        System.out.println("checking equality of given two arrays after rotation");
        System.out.println(Arrays.equals(a1,a2));

        /**
         * sorting of an array using inbuild command
         */
        System.out.println("Array after sorting using inbuild command");
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));


        /**
         *
         *          calculating the number of repetetions of a particular element
         *
         */
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("calculating the number of repetetions of a particular element");

        int a[]={1,1,1,2,2,2,3,3,3,1,1,1,1,6,6,6,7,7,7,3,3,3,3,3};
        int num=a[0];
        int count;
        for(int i=0;i<a.length;i++)
        {
            count=0;
            for (int j=i;j<a.length;j++) {
                if (num == a[j]) {
                    count += 1;
                } else if (num != a[j]) {
                    System.out.printf("number:"+num +" ,"+" count:"+ count).println();
                    //System.out.printf(num +"   "+ count).println();
                    num = a[j];
                    count = 1;
                }
                if ( j == a.length -1){
                    System.out.printf("number:"+num +" ,"+" count:"+ count).println();
                }
                i=j;
            }
        }
/**
        for(int i=0;i<10;i++)
        {
            System.out.print(i+" ");
            if(i%2==0)
            {
                continue;
            }
            System.out.println();
        }
*/

    outer:for(int i=0;i<10;i++)
    {
        for (int j=0;j<10;j++)
        {
            if(j>i)
            {
                System.out.println();
                continue outer;
            }
            System.out.print("  " + (i*j));
        }
        System.out.println();
    }

    }
}


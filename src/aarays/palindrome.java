package aarays;

import java.util.Scanner;

public class palindrome {

    static boolean isPalindrome(int n)
    {
        int m=n;
        int d=0,rev=0;
        while (n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=(int)n/10;
        }
        if(m==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int n1=sc.nextInt();
        boolean p=isPalindrome(n1);
        if(p==true)
        {
            System.out.println(n1+" is palindrome");
        }
        else
        {
            System.out.println(n1+" is not a palindrome");
        }
    }
}

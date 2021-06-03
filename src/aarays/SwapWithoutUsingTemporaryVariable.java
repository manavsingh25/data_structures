package aarays;
import java.io.*;
import java.util.*;

public class SwapWithoutUsingTemporaryVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int n1=sc.nextInt();
        System.out.println("enter number 2");
        int n2= sc.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("after swap");
        System.out.println("n1:"+n1+" , n2"+n2);
    }
}

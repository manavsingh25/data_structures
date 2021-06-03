package NumberTypes;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number :");

        Integer n=scan.nextInt();
        int num=n;
        int sum=0;

        int i=1;

        while(i<n)
        {
            int temp=n%i;
            if(temp==0)
                sum=i+sum;
            i++;
        }
        if(sum==num)
            System.out.println("Perfect number");

        else
            System.out.println("Not Perfect number");
    }
}

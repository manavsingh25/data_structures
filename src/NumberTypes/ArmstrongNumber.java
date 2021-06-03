package NumberTypes;
import java.util.Scanner;

/**
 *      An Armstrong number of three digits is an integer such that the sum of cubes of its
 *      digits is equals to the number itself...........
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int c=0,a,temp,sum=0;
        System.out.println("enter the number to check weather its an armstrong number or not");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c++;
        }
        n=temp;
        System.out.println("No of digits in the provided number are: " + c);
        while(n>0)
        {
            a=n%10;
            n=n/10;
            sum+=Math.pow(a, c);
        }
        if(temp==sum)
            System.out.println("the number is an armstrong number");
        else
            System.out.println("the number is not an armstrong number");
    }
}

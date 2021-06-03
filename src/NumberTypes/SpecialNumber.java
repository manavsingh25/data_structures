package NumberTypes;
import java.util.Scanner;

/**
 *      special number are those numbers whose factorial of digits are
 *      equals to the number itself..........
 *      for example....1!+4!+5!=145....fucking awesome.........
 */
public class SpecialNumber {
    static int factorial(int n)
    {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number ");
        Integer n=scan.nextInt();
        int num=n;
        int sum=0;
        int len = (int) (Math.log10(n) + 1);
        System.out.println("length="+len);
        while(n>0)
        {
            int temp=n%10;
            //double p=Math.pow(temp,len);
            sum=factorial(temp)+sum;
            n=n/10;
        }
        System.out.println("sum is   "+sum);
        if(num==sum)
            System.out.println("Special number");
        else
            System.out.println("Not a Special number");
    }
}

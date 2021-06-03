package NumberTypes;
import java.util.Scanner;

/**
 *      twisted prime numbers are those prime numbers which are prime in m=nature but are
 *      opposite to each other just like an palindrome.....
 *      for example (13,31),(17,71),(11,11),(3,3),(5,5)
 */
public class TwistedPrimeNumbers {
    public static boolean isPrime(long num) {
        if (num<=2)
            return false;
        for(int i=2;i<=(num/2);i++)
        {
            if (num%i==0)
                return false;
        }
        return true;
    }
    static int revs(int n)
    {
        int d=0,rev=0;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=(int)n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("enter till which number to generate twisted primes");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=2;
        for (int i=2;i<=n;i++)
        {
            if (isPrime(i) && isPrime(revs(i)))
            {
                System.out.printf("(%d, %d) ",i , revs(i));
            }
        }
    }
}

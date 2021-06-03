package NumberTypes;
import java.util.Scanner;

/**
 *      twin prime numbers are those prime numbers which differs by 2..
 *      and are next to each other like (3,5) and (5,7).....
 */
public class TwinPrime {

    public static void main(String[] args) {
        System.out.println("twin primes are \n");
        for (int i = 2; i < 100; i++) {

            if (is_Prime(i) && is_Prime(i + 2)) {
                System.out.printf("(%d, %d)", i, i + 2);
                //System.out.println(i);
                //System.out.println(i+2);
            }
        }
    }

    public static boolean is_Prime(long n) {

        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) return false;
        }
        return true;
    }
}

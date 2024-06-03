
/*------------------------------------------
 CURRENT DATE=28/12/2023, TIME=17:02
---------------------------------------------*/
import java.util.*;

public class Fibo {
    public static void main(String args[]) {
        // Find the nth number in fibonnaci series.

        // Fibo(n) = Fibo(n-1)+Fibo(n-2) // -- This is called as recurrance relation.

        // We know the base condition like F(0) = 0 and F(1) = 1.
        System.out.println(fibo(6));

    }

    static int fibo(int n) {
        // base condition:
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}



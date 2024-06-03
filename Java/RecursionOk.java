
/*------------------------------------------
 CURRENT DATE=28/12/2023, TIME=16:48
---------------------------------------------*/
import java.util.*;

public class RecursionOk {

    // Print the number from 1 to 5:
    public static void main(String args[]) {

        print(1);

    }

    static void print(int n){  // As we can see in the ok program that how the recusion call is working means 1 is calling 2 , 2 is calling 3 .... 
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1); // So we have used n+1 because the function is calling the upper version of itself.
    }
}
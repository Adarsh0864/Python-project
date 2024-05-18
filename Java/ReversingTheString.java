
/*------------------------------------------
 CURRENT DATE=24/09/2023, TIME=19:07
---------------------------------------------*/
import java.util.*;

public class ReversingTheString {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Hello");

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // So here the logic is 5 - 1 - 0

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }
}
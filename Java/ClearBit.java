/*------------------------------------------
 CURRENT DATE=28/09/2023, TIME=09:00
---------------------------------------------*/
import java.util.*;

public class ClearBit {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int numNumber = notBitMask & n;
        System.out.println(numNumber);
    }
}
/*------------------------------------------
 CURRENT DATE=28/09/2023, TIME=08:25
---------------------------------------------*/

// Get Bit :

// Definition: Getting a bit means extracting the value (0 or 1) of a specific bit at a given position within a binary number.

// Operation: To get the value of a particular bit, you typically use a bitwise AND operation with a bit mask that has only the bit of interest set to 1. If the result is non-zero, the bit is set (1); otherwise, it's clear (0).

import java.util.*;

public class BitManipulation {
    public static void main(String args[]) {
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit Was Zero");
        } else {
            System.out.println("Bit was non Zero.");
        }

    }
}
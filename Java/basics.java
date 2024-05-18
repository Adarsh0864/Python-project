
/*------------------------------------------
 CURRENT DATE=27/11/2023, TIME=11:02
---------------------------------------------*/
import java.util.*;

public class basics {
    public static void main(String args[]) {

        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 120;
        marks[4] = 98;

        System.out.println(marks[4]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Lets Say if we want to print the array in inverted manner:

        System.out.println("Printing the array in inverted manner:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
    }
}
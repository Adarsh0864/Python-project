
/*------------------------------------------
 CURRENT DATE=10/01/2024, TIME=20:21
---------------------------------------------*/
import java.util.*;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1; // If -1 will return means our key does not exist.

    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10; // This is the thing to search.

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("We dont have the key for you.");
        } else {
            System.out.println("Key is found at the index of :" + index);
        }

    }
}

// "The time complexity for the linear search will be O(n)."
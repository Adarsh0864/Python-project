/*------------------------------------------
 CURRENT DATE=28/09/2023, TIME=17:57
---------------------------------------------*/

//                     *BUBBLE SORT*


import java.util.*;

public class SortingInJava {
    public static void main(String[] args) {
        int array[] = { 7, 8, 3, 1, 2 };

        // bubble sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {// Here in the first loop of i we have sorted 1 time thats why we are subtracting this by i and here the value of i is 1.
                if (array[j] > array[j + 1]) {
                    // Then swap:
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArray(array);
    }

    public static void printArray(int[] array) { // Here we have declared the function to print the array.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
// Note : We will not use the bubble sort , selection sort or insertion sort inupcoming compitions or anything because the time complexity of these methods are high .O(n^2)
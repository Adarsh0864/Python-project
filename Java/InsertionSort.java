/*------------------------------------------
 CURRENT DATE=28/09/2023, TIME=18:50
---------------------------------------------*/
import java.util.*;
public class InsertionSort {
    public static void printArray(int[] array) { // Here we have declared the function to print the array.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
public static void main(String args[]){
    int array[]={7,8,3,1,2};

    //insertion sort :

    for(int i = 1; i<array.length;i++){
        int current = array[i];
        int j = i-1;
        while(j>=0 && current <array[j]) {
            array[j+1]=array[j];
            j--;

        }
        //placement of the array:
        array[j+1]=current;
    }
    printArray(array);


}
}
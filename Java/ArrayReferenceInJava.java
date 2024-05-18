/*------------------------------------------
 CURRENT DATE=20/10/2023, TIME=23:10
---------------------------------------------*/


// When we are taking the reference then there in no new memory allocation there is just a reference copying and nothing else.
import java.util.*;
public class ArrayReferenceInJava {
    static void printArray(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
public static void main(String args[]){

    int [] arr = new int[5];
    arr[0] = 1;
    arr[1] = 2;
    arr[3] = 4;
    arr[4] = 5;

    System.out.println("This is the Original Array : ");
    printArray(arr);


    int[] arr_2 = arr;   // Here we are Copying arr in arr_2.
    System.out.println("This is the Copied Array: ");
    printArray(arr_2);


}
}

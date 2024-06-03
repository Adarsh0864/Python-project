/*------------------------------------------
 CURRENT DATE=28/09/2023, TIME=18:39
---------------------------------------------*/
import java.util.*;
public class SelectionSort {
    public static void printArray(int[] array) { // Here we have declared the function to print the array.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
        
      // time complexity = O(n^2)
public static void main(String args[]){
    int array[]= {7,8,3,1,2};

    //selection sort :
    for(int i = 0;i<array.length-1;i++){
        int smallest = i;// Here we have stored the index of the smallest element.
        for(int j=i+1 ; j<array.length ; j++){
            if(array[smallest]>array[j]){
                smallest = j; // So we will store the value of smallest in j.
            }
        }
        int temp=array[smallest];
        array[smallest]=array[i];
        array[i]=temp;
        
    }
    printArray(array);

}
}
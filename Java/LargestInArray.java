// /*------------------------------------------
//  CURRENT DATE=10/01/2024, TIME=21:39
// ---------------------------------------------*/

// // In terms of java we take largest element(+Infinity) indicates the Integer.MAX_VALUE
// // And the smallest term is represented by (-Infinity) indicated by Integer.MIN_VALUE

// import java.util.*;
// public class LargestInArray {
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;

//         for(int i = 0;i<numbers.length;i++){
//             if(largest<numbers[i]){
//                 largest = numbers[i];
//             }
//         }
// return largest;
//     }
// public static void main(String args[]){
//     int number[]={1,2,6,3,5};

//     System.out.println("Largest Value is:" + getLargest(number));

// }
// }


// Now lets say we wannaa find the smallest element in the given group of the array:

public class LargestInArray{

    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public  static void main(String args[]){
        int []numbers = {2,3,4,5,6};

        System.out.println("SO the smallest value will be::"+ getSmallest(numbers));

    }
}

//"The time complexity of this problem will be O(n)".
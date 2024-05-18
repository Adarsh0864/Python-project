// //In binary search we need to make sure thaat the element should be sorted.
// /*------------------------------------------
//  CURRENT DATE=10/01/2024, TIME=23:09
// ---------------------------------------------*/
// import java.util.*;
// public class BinarySearch {
//     public static int binarySearch(int numbers[], int key){
//         int start = 0,end = numbers.length-1;

//         while(start<=end){
//             int mid = (start+end)/2;
            
//             if(numbers[mid]==key){
//                 return mid;
//             }

//             if(numbers[mid]<key){
//                 start = mid+1;
//             }
//             else{
//                 end = mid-1;
//             }

//         }
//         return -1;


//     }
// public static void main(String args[]){

//     int number []={2,4,6,8,10,12,14};
//     int key = 14;

//     System.out.println("The index value will be: "+ binarySearch(number,key));

// }
// }







//Practice:

public class BinarySearch {

    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 4;

        System.out.println("index for the key: " + binarySearch(numbers, key));
    }
}


// In binary Search the time complexity is O(logn).
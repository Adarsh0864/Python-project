// // /*------------------------------------------
// //  CURRENT DATE=01/11/2023, TIME=18:30
// // ---------------------------------------------*/
// // import java.util.*;
// // public class SortingArrayInIncresingOrder {

// //     static boolean isSorted(int[] arr){
// //         boolean check = true;

// //         for(int i = 1 ; i<arr.length;i++){  // We will start i from 1 because if we start from 0 then if will check from -1.
// //             if(arr[i]<arr[i-1]){
// //                 check = false;

// //                 break;
// //             }
// //         }
// //         return check;

// //     }
// // public static void main(String args[]){
// //     Scanner sc = new Scanner(System.in);
// //     System.out.println("Enter the size of the array:");
// //     int n = sc.nextInt();

// //     int [] arr = new int[n];
// //     System.out.println("Enter"+ n + "Elements:");
// //     for(int i = 0; i<arr.length;i++){
// //         arr[i]=sc.nextInt();
// //     }

// //     System.out.println("Is Sorted " + isSorted(arr));

// // }
// // }

// import java.util.*;

// public class SortingArrayInIncresingOrder {

//     static boolean isSorted(int[] arr) {
//         boolean check = true;

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < arr[i - 1]) {
//                 check = false;
//                 break;

//             }

//         }

//         return check;
//     }


//  public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the No of the Array: ");
//     int n = sc.nextInt();

//     int []  arr= new int[n]; 
//     System.out.println("Enter " + n + "Elements");
//     for(int i = 0 ; i<arr.length;i++){
//         arr[i]= sc.nextInt();

//     }


// System.out.println("Here is your sorted array : " +isSorted(arr));
// }
// }



 import java.util.*;

 public class SortingArrayInIncresingOrder {

    static boolean isSorted(int [] arr ){
        boolean check = true;
    
    for(int i = 1; i<arr.length;i++){
        if(arr[i]<arr[i-1]){
            check = false;
            break;
        }
    }

    return check;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the no of the array: ");
        int n = sc.nextInt();


        int [] arr = new int[n];
        System.out.println("Enter " + n + " Elements");

    }




 }
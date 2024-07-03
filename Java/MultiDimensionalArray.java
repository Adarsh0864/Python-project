// // /*------------------------------------------
// //  CURRENT DATE=17/10/2023, TIME=18:16
// // ---------------------------------------------*/
// // import java.util.*;
// // public class MultiDimensionalArray {

// //     void MultiDimensionalArray(){
// //         int[][] arr = {{56, 43 , 6},{90, 80, 60},{12, 16, 24}};


// //         System.out.println(arr[0][0]); // This will print 56
// //         System.out.println(arr[0][1]); // This will print 43
// //         System.out.println(arr[0][2]); // This will print 6

// //         System.out.println(arr[1][0]); // This will print 90
// //         System.out.println(arr[1][1]);// This will print 80
// //         System.out.println(arr[1][2]);// This will print 60

// //         System.out.println(arr[2][0]);// This will print 12
// //         System.out.println(arr[2][1]);// This will print 16
// //         System.out.println(arr[2][2]);// This will print 24
// //     }
    
// // public static void main(String args[]){

// //    MultiDimensionalArray obj = new MultiDimensionalArray();
// //     obj.MultiDimensionalArray();

// // }
// // }


// // Or we can we also use like this:

// /*------------------------------------------
//  CURRENT DATE=17/10/2023, TIME=18:16
// ---------------------------------------------*/
// import java.util.*;

// public class MultiDimensionalArray {

//     public MultiDimensionalArray() {
//         int[][] arr = {{56, 43, 6}, {90, 80, 60}, {12, 16, 24}};

//         System.out.println(arr[0][0]); // This will print 56
//         System.out.println(arr[0][1]); // This will print 43
//         System.out.println(arr[0][2]); // This will print 6

//         System.out.println(arr[1][0]); // This will print 90
//         System.out.println(arr[1][1]); // This will print 80
//         System.out.println(arr[1][2]); // This will print 60

//         System.out.println(arr[2][0]); // This will print 12
//         System.out.println(arr[2][1]); // This will print 16
//         System.out.println(arr[2][2]); // This will print 24
//     }

//     public static void main(String[] args) {
//         MultiDimensionalArray obj = new MultiDimensionalArray();
//     }
// }


 import java.util.*;
 public class MultiDimensionalArray {

     void MultiDimensionalArray(){
       int[][] arr = {{56, 43 , 6},{90, 80, 60}};
       for(int i = 0; i<arr.length;i++){

        for(int j = 0;j<arr[i].length;j++){ // Array ke andar wale arrays ko call krne kr liye is loop ka use kr rhe hain
            System.out.println(arr[i][j]);
        }

       }


    }
}
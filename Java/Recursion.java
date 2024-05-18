/*------------------------------------------
 CURRENT DATE=28/09/2023, TIME=21:38
---------------------------------------------*/
// import java.util.*;
// public class Recursion {
// public static void printNum(int n){
//     //Print Number from 5 to 1

//      if(n==0){
//         return;
//      } 
     
     
//      System.out.println(n);       // We use syso to print the System.out.println
//     printNum(n-1);
    
// }

//         public static void main(String args[]){
//             int n = 5;
//             printNum(n);
//         }
// }

// Recursion occupy much space and there is also a case of stack overflow where we dont have any other memory left, so that case is called as stack overflow.


             // Question 2 : Print number from 1 to 5:
    /*------------------------------------------
     CURRENT DATE=13/10/2023, TIME=11:14
    ---------------------------------------------*/
    import java.util.*;
    public class Recursion {
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n);
            
    
    }
    }
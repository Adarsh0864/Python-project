
// /*------------------------------------------
//  CURRENT DATE=11/01/2024, TIME=00:00
// ---------------------------------------------*/
// import java.util.*;

// public class ReversingAnArray {

//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length - 1;

//         while (first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;

//         }
//     }

//     public static void main(String args[]) {

//         int numbers[] = { 2, 3, 4, 5, 6, 7 };

//         reverse(numbers);

//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }

//     }

// }

// // here we got the time complexity as n and space complexity as 1


// // Practice:

/*------------------------------------------
 CURRENT DATE=11/01/2024, TIME=09:45
---------------------------------------------*/
import java.util.*;
public class ReversingAnArray {

    public static void ReversingAnArray(int numbers[]){
    int first = 0, last = numbers.length-1;

    while(first<last){
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] =temp;

        first++;
        last--;
    }
    }
public static void main(String args[]){

    int numbers[] = {2,3,4,5,6,7,8};

     ReversingAnArray(numbers);

     for(int i = 0; i<numbers.length;i++){
        System.out.println(numbers[i]);
     }

}
}
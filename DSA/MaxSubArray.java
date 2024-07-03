/*------------------------------------------
 CURRENT DATE=06/06/2024, TIME=10:52
---------------------------------------------*/
import java.util.*;
public class MaxSubArray {
    public static void MaxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum =" + maxSum);
        if(maxSum<currSum){
            maxSum = currSum;
        }
    }

    public static void main(String args[]) {
        int numbers[] ={2,4,6,8,10};
        MaxSubArraySum(numbers);

    }
}

// /*------------------------------------------
//  CURRENT DATE=28/06/2024, TIME=13:53
// ---------------------------------------------*/
// import java.util.*;

// public class MaxSub {
//     public static void maxSum(int numbers[]) {
//         int currSum;
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = start; j < numbers.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for (int k = start; k <= end; k++) {
//                     currSum += numbers[k];
//                 }
//                 if (currSum > maxSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }

//         System.out.println("The maximum sum will be: " + maxSum);
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         maxSum(numbers);
//     }
// }

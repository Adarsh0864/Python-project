
/*------------------------------------------
 CURRENT DATE=03/07/2024, TIME=10:17
---------------------------------------------*/
//In this case of Prefix sum approach the time complexity will be n^2,and earlier as we can see in the bruteforce case the time complexity comes as n^3

import java.util.*;

public class Max_SubArray_Prefix_Sum {
    public static void maxSubArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // calculate prefix array:
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 1; j < numbers.length; j++) {
                int end = j;

                // currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                // or we can write like this as well:
                if (start == 0) {
                    currSum = prefix[end];
                }else{
                    currSum=prefix[end]-prefix[start-1];

                    }
                    if(maxSum<currSum){
                        maxSum=currSum;
                }
            }

            
        }
        System.out.println("max sum ="+maxSum);

    }

    public static void main(String args[]) {

        int numbers[] ={1,-2,6,-1,3};

        maxSubArray(numbers);

    }
}


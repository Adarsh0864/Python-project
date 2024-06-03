/*------------------------------------------
 CURRENT DATE=10/01/2024, TIME=19:52
---------------------------------------------*/

// Note: IF we want to run our code using the compiler so we will use "javac TakingInputAndShowingOutput.java" for running and using "java TakingInputAndShowingOutput.java" for compiling.

import java.util.*;
public class TakingInputAndShowingOutput {
public static void main(String args[]){
    int marks[] = new int[3];
    Scanner sc = new Scanner(System.in);

    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2]=sc.nextInt();

    System.out.println("The output will be :");
    for(int i = 0; i<marks.length;i++ ){
        System.out.println(marks[i]);
    }

    //Now if we want to update our marks so we can also do that :

    marks[2] = 100;
    System.out.println("Updated marks:" + marks[2]);

    // We can also find the percentage to solve:
    int percentage = (marks[0]+marks[1]+marks[2]/3);
    System.out.println("Percentage will be: "+percentage+"%");

}
}
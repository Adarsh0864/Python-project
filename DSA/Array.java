/*------------------------------------------
 CURRENT DATE=17/05/2024, TIME=11:30
---------------------------------------------*/
import java.util.*;
public class Array {
public static void main(String args[]){

    // Take input in array:

    int marks[] = new int[100];

    Scanner sc = new Scanner(System.in);

    marks[0] =sc.nextInt();
    marks[1] =sc.nextInt();
    marks[2] =sc.nextInt();

    System.out.println("phy:"+ marks[0]);
    System.out.println("CHE:"+ marks[1]);
    System.out.println("MATH:"+ marks[2]);
    
   // if you wanted to update your marks:
    marks[2] = marks[2]+1;
    System.out.println(marks[2]);

    int percentage = (marks[0] +marks[1]+marks[2])/3;

    System.out.println("percentage is:"+percentage);

}
}


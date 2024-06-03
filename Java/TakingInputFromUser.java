/*------------------------------------------
 CURRENT DATE=20/10/2023, TIME=22:47
---------------------------------------------*/
import java.util.*;
public class TakingInputFromUser {

public static void main(String args[]){
    System.out.println("Enter the size of your Array: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n]; 

    System.out.println("Enter " + " n " + "terms: ");
    for(int i = 0; i<arr.length;i++){
       arr[i] = sc.nextInt();
    }

    System.out.println("THis will be your Output :");
    for(int i = 0; i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}
/*------------------------------------------
 CURRENT DATE=17/05/2024, TIME=12:17
---------------------------------------------*/
import java.util.*;
public class LargestInArray {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];

            }
        }
        return largest;
    }
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of elements in the array:");
    int n = sc.nextInt();

    int numbers[] = new int[n];

    for(int i =0;i<n;i++){
        numbers[i]= sc.nextInt();
    }

    System.out.println("Here the largest element is " + getLargest(numbers));

}
}
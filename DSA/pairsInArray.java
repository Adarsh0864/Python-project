/*------------------------------------------
 CURRENT DATE=06/06/2024, TIME=10:15
---------------------------------------------*/
import java.util.*;
public class pairsInArray {
    public static void printPairs(int numbers[]){
        int tp = 0;
        for (int i = 0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j = i+1;j<numbers.length;j++){
                System.out.println("(" + curr +","+ numbers[j]+ ")");
                tp++;
            }
              System.out.println();
        }
        System.out.println("The total pairs will be :" + tp);
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int [] numbers = new int[n];

    System.out.println("Enter the elements in the array:");
    for(int i = 0; i<n;i++){
        numbers[i] = sc.nextInt();
    }
    printPairs(numbers);

    


}
}

/*------------------------------------------
 CURRENT DATE=21/05/2024, TIME=22:44
---------------------------------------------*/
import java.util.*;
public class SmallestInArray {

    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("ENter the total no of array🙏:");

    int n = sc.nextInt();

    System.out.println("ENter your elements one by one:");

    int numbers[] = new int[n];

    for(int i =0 ;i<n;i++){
        numbers[i]= sc.nextInt(); 
    }
System.out.println("The smallest number in here is :" + getSmallest(numbers));

}
}

/*------------------------------------------
 CURRENT DATE=17/05/2024, TIME=11:54
---------------------------------------------*/

// TIme complexity of linear Search is : O(n)
import java.util.*;
public class LinearSearch {

    public static int linearSearch(int numbers[],int key){
    for(int i = 0;i<numbers.length;i++){
        if (numbers[i]==key){
            return i;
        }
    }
    return -1;
    }
public static void main(String args[]){

    int numbers[]= {10,20,30,40,50};
    int key = 20;

    int index = linearSearch(numbers, key);

        if(index == -1){
            System.out.println("not found");
        }else{
                System.out.println("You have found the key:"+index);
            }

        }
    }



//Question-->Take an array as input from the user. Search for a given nmber x and print the index at which it occur?

import java.util.*;
public class ArrayQus01 {
    public static void main ( String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your values:");
        int size = sc.nextInt();
        int numbers[]= new int[size];

        // input-->
        for(int i = 0; i<size; i++){
            numbers[i]=sc.nextInt();
        }


        System.out.println("What are you searching for:");
        int x = sc.nextInt();

        System.out.println("Your output will be following:");
        //output:
        for(int i = 0; i<size; i++){
            if(numbers[i]==x){
                System.out.println("X found at index : "+ i);
            }
        }
    }  
}

// "This algorithm is called linear search".

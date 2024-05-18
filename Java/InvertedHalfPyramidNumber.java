import java.util.*;
public class InvertedHalfPyramidNumber{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value for n : ");
        int n = sc.nextInt();

        System.out.println("So yor answer is : ");
       for(int i = 1 ; i<=n ; i++){
        for(int j = 1 ; j<=n-i+1; j++ ){
            System.out.print(j);
        }
        
        System.out.println();
       }
    }



}
// import java.util.*;
// public class InitilizationInArray02 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[]= new int[size];

//         for(int i = 0; i<=size; i++){
//             System.out.println(numbers[i]);
//         }
//     }
// }
// So here in output it will give 0 because we didnt initilize this.








//(2)Now in second case when we initilize and get output so it apppers like this :-->
import java.util.*;
public class InitilizationInArray02 {
    public static void main ( String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your values:");
        int size = sc.nextInt();
        int numbers[]= new int[size];

        // input-->
        for(int i = 0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("Your output will be following:");
        //output:
        for(int i = 0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}



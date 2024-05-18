//import java.util.*;
//
//public class IfElse {
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the age : ");
//        int age = sc.nextInt();
//
//        if(age>19){
//            System.out.println("You can vote"); // There is a shortcut to print display to type syso.
//        }else{
//            System.out.println("You are not eligible to vote");
//        }
//
//    }
//}


//import java.util.*;
// class IfElse{
//     public static void main(String[]args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age : ");
//         int age =sc.nextInt();
//
//         if(age>=18){
//             System.out.println("You are an Adult");
//         }else{
//             System.out.println("You are a Child");
//         }
//
//
//
//     }
// }





import java.util.*;
class IfElse{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name");
    String Name = sc.nextLine();


    System.out.println("Enter Your Age: ");
    int age = sc.nextInt();


    if(age>=18){
        System.out.println("You are an Adult");
    }else{
        System.out.println("You are a Child");
    }


}
}



import java.util.*;
 public class InputJava {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();  // Here if we use .next then it can only print one word . But if we want to print a sentence then we need to use sc.nextLine()
         
            // wE can use nextInt(), nextFloat().
            System.out.println(name);
        }
    }
}
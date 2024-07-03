import java.util.*;
public class AccessOfWholeString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstName="Adarsh";
        String secondName="Mishra";

        String fullName=firstName+""+secondName;


        System.out.println(fullName.length());  // here we use .length()to know the length of word.

        for(int i =0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));  // by using this we can access/print each and every letter in the string.
        }

    }
}

    


import java.util.*;
public class ComparingTwoStrings {
    public static void main(String args[]){
        String name1= "Adarsh";  // here they are equal.
        String name2= "Adarsh";

        // if compare b/w tony and stark then tony will be bigger string because "t" is greater than "s".

        // 1. if s1>s2  --> +ve value.
        // 2. if s1=s2 --> 0 value.
        // 3. if s1<s2 --> -ve value.


        if(name1.compareTo(name2)==0){      // Here we use compareTo function because instead of == because at many places it failes.
            
            System.out.println("Your strings are equal.");
         } else{
                System.out.println("They are not equal");
            
        }
    }
    
}

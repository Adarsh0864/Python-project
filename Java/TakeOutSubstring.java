/*------------------------------------------
 CURRENT DATE=24/09/2023, TIME=18:14
---------------------------------------------*/
import java.util.*;
public class TakeOutSubstring {
public static void main(String args[]){

    String sentence = "My name is Adarsh";
    String name = sentence.substring(11);        // Here we have accessed the "Adarsh" part by pointing out 11th index as Adarsh, as if we count from the left then the adarsh part will be after 11th index.

    System.out.println(name);

    // Point to Note : String are Inmutable/ unchanged in nature , we cant change them to for the purpose of change we have to create a new string.

}
}
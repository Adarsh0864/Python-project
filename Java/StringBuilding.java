/*------------------------------------------
 CURRENT DATE=24/09/2023, TIME=18:26
---------------------------------------------*/

    
    //Note :Difference b/w string and StringBuilder.
//  (1)String:

// a.A String in programming represents text.
// b.It is immutable, meaning once created, it cannot be changed.
// c.If you modify a String, it creates a new one in memory.
// d.Good for situations where the text doesn't change frequently.
// e.Examples: "Hello", "World".


// (2)StringBuilder:

// a.StringBuilder is used for mutable text manipulation.
// b.It allows you to modify the content without creating new objects.
// c.Efficient for tasks involving frequent text modifications.
// d.Examples: Creating dynamic strings or modifying existing ones.
    


import java.util.*;
public class StringBuilding {
public static void main(String args[]){

    StringBuilder sb = new StringBuilder("Adarsh");
    System.out.println(sb);

    //Char at 0 index:
    System.out.println(sb.charAt(0));

    // If we want to replace "A" in the word Adarsh which is at index 0 with "P":
    // Then we will use the command:

    sb.setCharAt(0, 'P');
    System.out.println(sb);


    //Lets say if we want to insert a "letter" in b/w a "word" so we use the following:

    sb.insert(2, 'p');
    System.out.println(sb);


    //If we want to delete a character in the letter :

    sb.delete(2, 3); // So it will start from the index 2 and till index 3 and delete in b/w word.
    System.out.println(sb);



}
}
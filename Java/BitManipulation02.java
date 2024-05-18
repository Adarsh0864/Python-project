/*------------------------------------------
 CURRENT DATE=28/09/2023, TIME=08:34
---------------------------------------------*/

// Set Bit :-->
// 1st Step:  Bit mask : 1<<i

// 2nd Step: Use the operation OR.


// Question == Set the 2nd bit(position =1 )of a number n. (n=0101)
//Answer == means we have to get the position one number and as we can se the position 1 has the number 0.
// 2 > and when we bit it by 1<<i means 1<<1 so it will came as 0111  
import java.util.*;
public class BitManipulation02 {
public static void main(String args[]){
    int n = 5;
    int pos= 1;
    int bitMask = 1<<pos;

    int newNumber =bitMask|n;
    System.out.println(newNumber);




}
}
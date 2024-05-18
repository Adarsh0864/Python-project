/*------------------------------------------
 CURRENT DATE=28/09/2023, TIME=09:12
---------------------------------------------*/
import java.util.*;
public class UpdateBit {
public static void main(String args[]){

    // Question= Update the 2nd bit (position = 1)of a number n to (n = 0101).
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    //oper = 1 : set operation = 0: clear
    int n = 5;
    int pos = 1;

    int bitMask = 1<<pos;
    if(pos==1){
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }else{
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
    }



}
}
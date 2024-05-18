/*------------------------------------------
 CURRENT DATE=14/10/2023, TIME=09:50
---------------------------------------------*/
import java.util.*;
public class Array {

    void DemoArray(){
        int[] ages = new int[3300];

        float[] weight = new float[3];
        String[] names = new String[3];

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;
        ages[4] = 40;

        for(int i = 0; i<5; i++){
            System.out.println(ages[i]);
        }
    }
public static void main(String args[]){

    Array array = new Array();
    array.DemoArray();


}
}
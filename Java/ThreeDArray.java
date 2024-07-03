/*------------------------------------------
 CURRENT DATE=17/10/2023, TIME=18:34
---------------------------------------------*/
import java.util.*;
public class ThreeDArray {

    /* For Each Loop : Example{

        // If we want to print all the ages from index 1 to 3:
        
        for(int age : ages){
            System.out.println(age);
        }

    } */

    void ThreeDArray(){
        int [][][] arr_3= new int[5][2][3];
        arr_3[0][0][0] = 1;

        for(int i = 0;i<arr_3.length;i++){
            for(int j = 0; j<arr_3[i].length;j++){
                for(int k = 0; k<arr_3[i][j].length;k++){
                    System.out.print(arr_3[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
public static void main(String args[]){

    ThreeDArray obj = new ThreeDArray();
    obj.ThreeDArray();

    

}
}
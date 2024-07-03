// We Always pass the array by reference, function ke andar bhejkar apne jo bhi changes krwa liye wo apke main function me bhi reflect krega.

/*------------------------------------------
 CURRENT DATE=10/01/2024, TIME=20:14
---------------------------------------------*/
import java.util.*;
public class PassingArrayAsArgument {

    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i]=marks[i]+1;// Here we are updating the value of marks by 1.
        }
    }
public static void main(String args[]){
    int[] marks = {97,98,99};
    update(marks);

    for(int i = 0;i<marks.length;i++){
        System.out.println(marks[i]);
    }

}
}


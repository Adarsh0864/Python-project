import java.util.*;
class NumberPytamid{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            //Now printing the number:
            for(int j=1; j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
}
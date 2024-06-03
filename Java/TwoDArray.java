import java.util.*;

public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows:");
        int rows= sc.nextInt();

        System.out.println("Enter the number of coloumn: ");
        int coloumn=sc.nextInt();

        int[][]numbers=new int[rows][coloumn];// Here we take input in row multiply by coloumn .

        //input:
        for(int i = 0;i<rows;i++){
            for(int j =0;j<coloumn;j++){
                numbers[i][j]= sc.nextInt();//We are storing this in number[i][j]
            }
        }
        //output:
        for(int i=0;i<rows;i++){
            for(int j =0; j<coloumn;j++){
                
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}


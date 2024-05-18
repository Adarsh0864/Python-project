// import java.util.Scanner;
import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        double sum = 0;
        
        // Calculate the sum of the series
        for (int i = 0; i < n; i++) {
            sum += Math.pow(x, i);
        }
        
        System.out.println("Sum of the series: " + sum);
    }
}

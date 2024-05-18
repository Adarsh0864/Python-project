////import java.util.*;
////
////class SumofNNaturalNumber{
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the value of n :");
////        int n = sc.nextInt();
////
////        int sum = 0;
////        for(int i = 0;i<=n;i++){
////            sum = sum+i;
////        }
////        System.out.println(sum);
////    }
////}
//
//
//import java.util.*;
//
//class SumofNNaturalNumber{
//    public static void main(String[] args){
//        System.out.println("Enter the value of n : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for(int i =0; i<=n; i++){
//            sum = sum+i;
//        }
//
//        System.out.println(sum);
//    }
//}


import java.util.*;

class SumofNNaturalNumber{
    public static void main(String[] args){
        System.out.println("Enter the value of n: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = n*(n+1)/2;
            System.out.println(sum);
        }
    }

}

// public class Arrays01 {
//     public static void main(String[]args){
//         //Storing marks of Subjects:
//         int marks[] = new int[3];
//         marks[0]= 90;
//         marks[1]= 85;
//         marks[2]= 93;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         // We can also use this printing thing with the help of loops so:
//         for(int i = 0; i<3; i++){
//             System.out.println(marks[i]);

//         }
// // "If we check out the main function so we are using String [] args That means it is also an array which help in storing the string."
//     }
    
// }




// We can also store the array in this format :-->

public class Arrays01 {
    public static void main(String args[]){
        int marks[]= {90,85,93};

        for(int i = 0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}

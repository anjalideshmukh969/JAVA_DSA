//import java.util.*;
//public class array2D {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int [][] arr2d = new int[3][3];
//        System.out.println("no. of rows in 2d array : " + arr2d.length); //no.of rows
//        //input
//        for(int row = 0; row<arr2d.length; row++){
//            //for each col in every row
//            for(int col = 0; col<arr2d[row].length; col++){
//                arr2d[row][col] = sc.nextInt(); //taking input
//            }
//        }
//        //output
////        for(int row = 0; row<arr2d.length; row++){
////            for(int col = 0; col<arr2d[row].length; col++){     //arr2d[row].length → number of columns in that particular row.
////                System.out.print(arr2d[row][col] + " ");
////            }
////            System.out.println(); //Moves to the next line after completing one row.
////        }
//        // Output using Arrays.toString()

////        for(int row = 0; row < arr2d.length; row++)
//            //enhanced for loop
//        for (int[] arr : arr2d) {
//            System.out.println(Arrays.toString(arr));
//        }
//        sc.close();
//    }
//}

//ques 2
import java.util.Scanner;
public class array2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

      int [][] arr = new int[row][col];

      //i/p
        for(int i = 0; i<arr.length; i++){
            //col
            for(int j  = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //out[ut
        for(int i = 0; i<arr.length; i++){
            for(int j  = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
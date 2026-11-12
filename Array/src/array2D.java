import java.util.*;
public class array2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] arr2d = new int[3][3];
        System.out.println("no. of rows in 2d array : " + arr2d.length); //no.of rows
        //input
        for(int row = 0; row<arr2d.length; row++){
            //for each col in every row
            for(int col = 0; col<arr2d[row].length; col++){
                arr2d[row][col] = sc.nextInt(); //taking input
            }
        }
        //output
//        for(int row = 0; row<arr2d.length; row++){
//            for(int col = 0; col<arr2d[row].length; col++){     //arr2d[row].length → number of columns in that particular row.
//                System.out.print(arr2d[row][col] + " ");
//            }
//            System.out.println(); //Moves to the next line after completing one row.
//        }

        // Output using Arrays.toString()
//        for(int row = 0; row < arr2d.length; row++)
            //enhanced for loop
        for (int[] arr : arr2d) {
            System.out.println(Arrays.toString(arr));
        }
        sc.close();
    }
}

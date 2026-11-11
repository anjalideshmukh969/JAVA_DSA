import java.util.*;

public class array2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] arr2d = new int[2][3];
        System.out.println(arr2d.length); //no.of rows
        //input
        for(int row = 0; row<arr2d.length; row++){
            //for each col in every row
            for(int col = 0; col<arr2d[row].length; col++){
                arr2d[row][col] = sc.nextInt();
            }
        }
        //output
        for(int row = 0; row<arr2d.length; row++){
            //for each col in every row
            for(int col = 0; col<arr2d[row].length; col++){
                 //print o/p
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

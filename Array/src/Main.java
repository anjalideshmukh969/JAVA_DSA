import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] arr = {1 , 2, 3, 4};
        System.out.println(Arrays.toString(arr));
//with new keyword
        int[] ary = new int[5];
        ary[0] = 3;
        ary[1] = 9;
        ary[2] = 38;
        ary[3] = 9;
        for(int i = 0; i< ary.length -1; i++){ //rmv last digit
            System.out.print(ary[i] + " ");
        }
        System.out.println();//next line

        //for-each loop
        for(int num : ary){
            System.out.print(num + " ");
        }
//string aarray
        String[] ar = new String[5];  //new String[5] creates an array of 5 elements.
        System.out.print(Arrays.toString(ar)); //5 null obj. created

    }
}
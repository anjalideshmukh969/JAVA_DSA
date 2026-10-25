import java.util.*;
public class concepts {
    public static void main(String[] args){
        //method overloading
        int ans = sum(3,5);
        System.out.println("first method : " + ans);

        int ans2 = sum(3,5, 5);
        System.out.println("second method : " + ans2);
    }
    //same methods with different parameter
    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        System.out.println("Hello " + a);

        System.out.println("Enter input");

        int marks = sc.nextInt();
        System.out.println("your marks are " + marks);

//        primitive data type- data type which can not break even further data types or data
        int age = 13;
        byte n = (byte) 256;
        char letter = 'a';
        float mark = 3.13f;
        double large_decimal = 12345.1234;
        long large_int = 12345678L;
        boolean t_f = true;
        sc.close();
    }
}
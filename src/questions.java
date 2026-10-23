import java.util.Scanner;

public class questions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//question1
//        System.out.print("Enter character : ");
//        char ch = sc.next().trim().charAt(0);
//
//        if(ch>= 'a' && ch<= 'z' ){
//            System.out.println("lowercase");
//        }else if(ch >= 'A' && ch<= 'Z') {
//            System.out.println("uppercase");
//        }else{
//            System.out.println("not an albhabet");
//        }
//        sc.close();

//        question 2-fibonacci numbers

//        int n = sc.nextInt();
//        int a = 0;
//        int i = 1;

//        question 3 - patterns
        int n = sc.nextInt();
        for(int i = 0; i< n; i++ ){
            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
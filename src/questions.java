import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
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
//            System.out.println("not an alphabet");
//        }
//        sc.close();

// question 2-fibonacci numbers
//        int n = sc.nextInt();
//        int a = 0, b = 1;
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + "");
//            int c = a+b;
//            a = b;
//            b = c;
//        }

//question-3 nth Fibonacci number
//        int n = sc.nextInt();
//        int a = 0, b = 1;
//
//        for (int i = 1; i <= n; i++) {
//            int c = a+b;
//            a = b;
//            b = c;
//        }
//        System.out.print(a);

//        question 4 - patterns
//        int n = sc.nextInt();
//        for(int i = 0; i< n; i++ ){
//            for(int j = 0; j<n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//question-5 counting occurrence
        int n = 7457877;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 7){
                count++;
            }
            n = n/10;
        }
        System.out.print(count);
    }
}
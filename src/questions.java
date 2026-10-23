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
//    }
//}

// question 2-fibonacci numbers
//        int n = sc.nextInt();
//        int a = 0, b = 1;
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + "");
//            int c = a+b;
//            a = b;
//            b = c;
//        }
//    }
//}

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
//    }
//}

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
//        int n = 7457877;
//        int count = 0;
//        while(n>0){
//            int rem = n%10;           //gets the last digit.
//            if(rem == 7){
//                count++;              //increases the count by 1 when the digit matches.
//            }
//            n = n/10;                 //removes last digit
//        }
//        System.out.print(count);
//    }
//}
//question 6-reverse of number
//        System.out.print("Entet input : ");
//        int inp = sc.nextInt();
//
//        int rev = 0;
//        while(inp>0){
//             int rem = inp % 10; //extracts the last digit.
//             inp = inp / 10; //removes the last digit.
//
//             rev = rev * 10 + rem; //builds the reversed number.
//        }
//        System.out.print(rev);
//    }
//}
//question 7 -reverse
//        int n = 1912;
//        while(n>0) {
//            int lastdigit = n % 10;
//            System.out.print(lastdigit);
//            n = n /10;
//        }
//    }
//}//question 8 - calculator
        int ans = 0;
        while(true) {
            System.out.print("enter operator : ");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.print("enter 2 no. : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                System.out.println(ans);
            }else {
                System.out.print("invalid operation");
            }
        }

    }
}
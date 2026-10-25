import java.util.Scanner;

public class practice {
    public static void main(String[] args){


//        Scanner inp = new Scanner(System.in);
//        int a = inp.nextInt();
//        int b= inp.nextInt();
//        int c= inp.nextInt();
////        int max = Math.max(c, Math.max(a,b));
////        System.out.println(max);
//        int max = 0;
//        if (a>b){
//            max = a;
//        }else{
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.print(max);
//        inp.close();

        //QUESTION- isPrime or not
         Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                boolean isPrime = true;

                if (n <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            }
        }

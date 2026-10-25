import java.util.Scanner;

public class functionp {
    public static void main(String[] args){
        showAge();

        int result = sum(3, 4);
        System.out.println(result);

        String pmsg = greet("Anjali Deshmukh");
        System.out.println(pmsg);

        System.out.println(add());
    }

     // void returns null
    static void showAge(){
        System.out.println("My age is 20");
    }

    //pass the val with param
    static int sum(int a ,int b){
        int ans = a +b;
        return ans;
    }

    // String param
    static String greet(String name){
        String msg = "Hello " + name;
        return msg;
    }
    //practice
    static int add(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a+b;
        return ans;
    }
}

public class function {
    public static void main(String[] args){

//        greeting();
////       greeting(); //Instead of writing the same code repeatedly, you can define it once and call it whenever needed.
//    }
//    static void greeting(){   //static — it can be called directly from main() because both methods are static, void — it returns nothing.,greeting() — the method name, with empty parentheses because it takes no parameters.
//        System.out.println("Hello World");



//        return string ,question 2
        String msg = greet();
        System.out.println(msg);
    }
    static String greet(){
        String greeting = "how r u?";
        return greeting;
    }
}

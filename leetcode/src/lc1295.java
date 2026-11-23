//1295. Find Numbers with Even Number of Digits
public class lc1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896,-21, 0};
        System.out.println(findNumbers(nums));
//        System.out.println(digits(-678));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            };
        };
        return count;
        }
        //fn to  check whether a no. contains even digits or not
        static boolean even(int num){
            int numberOfDigits = digits(num);
            return numberOfDigits % 2 == 0;
        }
        //count no. of digits in a number
        static int digits(int num){
        //edge
            if(num<0){
                num = num* -1;
            }
            if(num == 0){
                return 1;
            }

            //count no. of digits
            int count = 0;
            while(num>0){
                count++;
                num = num/10;
            }
            return count;
    }
}
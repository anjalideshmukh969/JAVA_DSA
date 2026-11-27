import java.util.ArrayList;

////implemented linear search at string
//public class linearSearch {
//    public static void main(String[] args){
//        String name = "Anjali";
//        char target = 'l';
//        System.out.println(search(name,target));
//    }
//    static int search(String str, char target){
//        if(str.length() == 0){ //str.isEmpty() can be also written
//            return -1;
//        }
//        for(int i =0; i<str.length(); i++){
//            if(str.charAt(i) ==  target){
//                return i;
//            }
//        }
//return -1;
//    }
//}


//same ques in range
//public class linearSearch {
//
//    public static void main(String[] args) {
//        String name = "Anjali";
//        char target = 'a';
//        System.out.println(search(name, target, 2, 5));
//    }
//    static int search(String str, char target, int start, int end) {
//        if (str.length() == 0) {
//            return -1;
//        }
//        for (int i = start; i < end; i++) {
//            if (target == str.charAt(i)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
// Q3 - L.S. on array
//public class linearSearch {
//    public static void main(String[] args){
//        int[] arr = {10,20,30,40,50,60,70};
//        int target = 60;
//        System.out.print(searching(arr,target));
//    }
//    static int searching(int[] arr, int target){
//        if(arr.length == 0 ){
//            return -1;
//        }
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i] ==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//}

//ques 4- minimum element
//public class linearSearch {
//    public static void main(String[] args) {
//        int[] arr = {12, 23, -4, 45, 1, -8};
//        System.out.print(min(arr));
//    }
//    static int min(int[] arr){
//        int ans = arr[0];
//        for(int i =1; i<arr.length; i++){
//            if(arr[i] < ans){
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }
//}
//Q5 - max in array
//public class linearSearch {
//    public static void main(String[] args) {
//        int[] arr = {12,3,4,5,6,76,4,5,34};
//        System.out.print(max(arr));
//
//    }
//    static int max(int[] arr){
//        int max = arr[0];
//        for(int i = 1; i<arr.length; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//}
//Q6- first occurrence of an element
//public class linearSearch {
//    public static void main(String[] args) {
//        int[] nums = {2,4,6,7,6,9,4,9,4};
//        int target = 6;
//        System.out.print(firstOccurrence(nums,target));
//    }
//    static int firstOccurrence(int[] nums, int target){
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }
//}
//Q7- last occurrence of an element
//public class linearSearch {
//    public static void main(String[] args) {
//        int[] nums = {2,4,6,7,6,9,46,6,9,4};
//        int target = 6;
//        System.out.print(lastOccurrence(nums,target));
//    }
//    static int lastOccurrence(int[] nums, int target){
//        for(int i = nums.length-1; i>=0; i--){
//            if(nums[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }
//}
//Q8  all occurrence
//public class linearSearch {
//    public static void main(String[] args) {
//        int[] nums = {2,4,6,7,6,9,46,6,9,4};
//        int target = 6;
//        allOccurrence(nums,target);
//    }
//    static void allOccurrence(int[] nums, int target){
//        for(int i = 0; i< nums.length;  i++) {
//            if (nums[i] == target) {
//                System.out.print(i + " ");
//            }
//        }
//    }

//Q9 -COUNT ALL OCCURRENCES OF ELEM
//public class linearSearch {
//    public static void main(String[] args) {
//        int[] nums = {2,4,6,7,6,9,46,6,9,4};
//        int target = 6;
//        System.out.print(allOccurrence(nums,target));
//
//    }
//    static int allOccurrence(int[]nums, int target){
//        int count = 0;
//        for(int i=0; i<nums.length; i++){
//            if(nums[i]==target){
//                count++;
//            }
//        }
//        return count;
//    }
//}
//Q10. Search in a 2D array
//public class linearSearch {
//    public static void main(String[] args) {
//        int [][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {9,7,8}
//        };
//        int target = 7;
//        searchIn2D(arr,target);
//    }
//    static void searchIn2D(int[][] arr, int target){
//        //for row
//        for(int i = 0; i<arr.length; i++){
//            //col
//            for(int j = 0; j<arr[i].length; j++){
//                if(arr[i][j] ==target){
//                    System.out.println("Found at : " + i + "," +j);
//                    return;
//                }
//            }
//        }
//        System.out.print("Not Found");
//    }
//}
//Q12. Search in an ArrayList
import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int target = 30;
        int result = searchList(list, target);

        System.out.println(result);
    }
    static int searchList(ArrayList<Integer> list, int target){
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) ==target){
                return i;
            }
        }
        return -1;
    }
}

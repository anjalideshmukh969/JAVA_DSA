import java.util.*;
public class arrays {
        public static void main(String[] args) {
            //swap 2 no.
//            int[] arr = {1,3,23,9,8,90};
//            swap(arr , 1 , 3);
//            System.out.println(Arrays.toString(arr));
//        }
//        static void swap(int[] arr, int index1, int index2){
//            int temp = arr[index1];
//            arr[index1 ]= arr[index2];
//            arr[index2] = temp;

            //q2-max val
            int[] arr = {1, 3, 23, 4, 5};
            System.out.println(max(arr)); //without range
            System.out.println(maxRange(arr, 1, 4)); //with range
        }
//fn 1 - with range
    static int maxRange(int[] arr, int start , int end){
            //work on edge cases here, like array being null
        if(end>start){
            return -1;
        }
        if(arr == null ){
            return -1;
        }
        int maxVal = arr[start]; //assume the first element is the maximum.
        for(int i = start; i<end; i++){
            if(arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
        //fn2
    }
            static int max(int[] arr){
            if(arr.length == 0){
                return -1;
            }
                int maxVal = arr[0]; //assume the first element is the maximum.
                for(int i = 1; i<arr.length; i++){
                    if(arr[i]> maxVal){
                        maxVal = arr[i];
                    }
                }
                return maxVal;
            }
      }
//Time Complexity: O(n) n space com - O(1)-we use only one extra var., maxVal
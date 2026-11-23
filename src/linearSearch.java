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
//            if(target ==  str.charAt(i)){
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

//ques 2- minimum element
public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, -4, 45, 1, -8};
        System.out.print(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,34,56,77,87,89,99,489,2908,12889};
        int target = 87;
        System.out.print(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end= arr.length-1;
        while(start<=end){ //Because even when low and high become equal, one element is still left to check.
            //find middle elem
//  int mid = (start + end)/2; //might br possible that(s.+e.) exceeds the range of int in java bcz integer have some fixed size
            int mid = start + (end-start)/2; //optimal
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;

    }
}

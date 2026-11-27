class Solution {
    public int search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        boolean isAsc = arr[0] < arr[high];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            } else {

                if (target > arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}

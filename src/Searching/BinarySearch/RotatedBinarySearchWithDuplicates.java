package Searching.BinarySearch;

public class RotatedBinarySearchWithDuplicates {
    public static void main(String[] args) {
//        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr = {2, 9, 2, 2, 2};
        int target = 2;

        System.out.println(search(arr, target));

    }

    static int search(int[] arr, int target){
        int pivot = findPivotWithDuplicates(arr);

        // if you did not find a pivot, it means the array is not rotated
        // then doo normal binary search
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found , you have found 2 asc sorted arrays
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 case over here

            if(mid < end && arr[mid] > arr[mid + 1]){ // to avoid index out of bound error
                // if our mid is last index then it will be checking for mid+1 that is error to avoid this use mid < end
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // if elements at middle, start, end are equals just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates

                // NOTE:- What if these elements at start and end were the pivot ????
                // Check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                // Check whether end is pivot or not
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted so, pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch (int[] arr, int target, int start, int end) {

        while(start <= end) {
//            find the middle element
//            int mid = (start + end) / 2; this may exceed the int range
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

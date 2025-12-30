package Searching.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // use this for non duplicates
    static int findPivot(int[] arr){
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
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    // use this for duplicates elements
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
}

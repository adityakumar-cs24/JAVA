import java.util.Arrays;

public class ReverseByRange {
    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 6, 5, 10, 11, 12};
        int n = arr.length;
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    public static void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

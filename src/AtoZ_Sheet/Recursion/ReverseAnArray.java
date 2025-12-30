package AtoZ_Sheet.Recursion;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        reverse(0, arr,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int i, int[] arr, int j){
        if(i >= j) return;
        swap(i, arr, j);
        reverse(i + 1, arr, j - 1);

    }
    public static void swap(int start, int[] arr, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

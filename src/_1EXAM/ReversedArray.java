package _1EXAM;
import java.util.Arrays;
import java.util.Scanner;
public class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, end = n - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}

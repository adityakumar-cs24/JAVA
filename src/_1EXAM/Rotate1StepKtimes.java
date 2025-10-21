package _1EXAM;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate1StepKtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of position to rotate : ");
        int k = sc.nextInt();
        k = k % n;
        for(int i = 0; i < k; i++){
            rotateByOne(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateByOne(int[] arr){
        int n = arr.length;
        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

}

package Searching.LinearSerach;

import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array length : ");
        int arrlength = input.nextInt();

        int[] arr = new int[arrlength];
        System.out.print("Enter elements : ");

        for(int i = 0; i < arrlength; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter Target : ");
        int target = input.nextInt();

        boolean ans = linearSearch2(arr, target);
        System.out.println(ans);

    }




    static boolean linearSearch2 (int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}

package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array length : ");
        int arrayLength = input.nextInt();

        if (arrayLength <= 0) {
            System.out.println("-1");
        }

        else {
            int[] arr  = new int[arrayLength];
            System.out.print("Enter array elements : ");

            for (int i = 0; i < arrayLength; i++) {
                arr[i] = input.nextInt();
            }

            System.out.print("Enter target : ");
            int target = input.nextInt();

            int ans = linearSearch(arr, target);
            System.out.println(ans);
        }



    }

    static int linearSearch (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

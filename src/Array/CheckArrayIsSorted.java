package Array;

import java.util.Scanner;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1]) continue;
            else{
                System.out.println("Array is Not Sorted.");
                break;
            }
        }
        System.out.println("Array is Sorted");
    }
}

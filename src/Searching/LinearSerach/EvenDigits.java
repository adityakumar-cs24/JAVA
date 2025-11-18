package Searching.LinearSerach;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int element : nums){
            if(even(element)){
                count++;
            }
        }
        return count;

    }

    static boolean even(int element){
        int numberOfDigits = digits(element);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int element){
        int count = 0;
        while(element > 0){
            count++;
            element /= 10;
        }
        return count;
    }
}

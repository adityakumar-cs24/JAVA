package _1EXAM;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("No. of Unique Elements are : ");
        int count = 0;
        for(int i = 0; i < n; i++){
            boolean isunique = true;
            for(int j = 0; j < n; j++){
                if(i != j && arr[i] == arr[j]){
                    isunique = false;
                    break;
                }
            }
            if(isunique){
                count++;
            }
        }
        System.out.println(count);
    }

}

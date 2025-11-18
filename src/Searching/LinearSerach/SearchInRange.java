package Searching.LinearSerach;
import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element : ");
        int target = sc.nextInt();
        System.out.print("Enter Start : ");
        int start = sc.nextInt();
        System.out.print("Enter End : ");
        int end = sc.nextInt();
        int ans = searchInRange(arr, target, start, end);
        System.out.println(ans);
    }

    static int searchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return - 1;
        }
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

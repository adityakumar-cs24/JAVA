package Searching.LinearSerach;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of array : ");
        int row = sc.nextInt();
        System.out.print("Enter columns of array : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.print("Enter elements of array : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Target Element : ");
        int target = sc.nextInt();
        int[] ans = searchIn2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2d(int[][] arr, int target){
        if(arr.length == 0){
            return new int[] {-1, -1};
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}

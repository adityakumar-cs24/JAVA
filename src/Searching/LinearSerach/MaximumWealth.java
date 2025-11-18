package Searching.LinearSerach;

import java.util.Scanner;

public class MaximumWealth {
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
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;

    }

}

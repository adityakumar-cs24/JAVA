package Array;

import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];
        int[][] arr3 = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows; j++){
                arr3[i][j] = 0;
                for(int k = 0; k < rows; k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

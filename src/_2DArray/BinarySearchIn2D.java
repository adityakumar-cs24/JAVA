package _2DArray;

import java.util.Arrays;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 8;
        int[] ans = binary(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] binary(int[][] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < arr.length && end >= 0) {
            if(arr[start][end] == target){
                return new int[] {start, end};
            }
            if(arr[start][end] < target){
                start++;
            }
            else{
                end--;
            }

        }
        return new int[] {-1, -1};
    }
}

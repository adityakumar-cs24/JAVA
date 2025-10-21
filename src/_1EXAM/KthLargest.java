package _1EXAM;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 3, 12, 9, 25, 18, 23};
        int k = 8;
        System.out.print(kthlargest(arr, k));
    }

    public static int kthlargest(int[] arr, int k){
        Arrays.sort(arr);
        return(arr[arr.length - k]);
    }

}

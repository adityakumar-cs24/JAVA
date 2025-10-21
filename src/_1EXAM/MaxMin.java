package _1EXAM;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 6};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = maxmin(arr, max, min);
        System.out.println(res);
    }
    public static int maxmin(int[] arr, int max, int min){
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;

    }
}

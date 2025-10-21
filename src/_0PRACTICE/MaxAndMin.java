package _0PRACTICE;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 65, 23, 12, 18};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max : " + max + " , " + " Min : " + min);

    }
}

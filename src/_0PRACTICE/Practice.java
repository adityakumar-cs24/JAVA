package _0PRACTICE;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
        int n = arr.length;
        int count = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);

    }
}

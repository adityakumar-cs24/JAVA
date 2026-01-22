import java.util.Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {9, 17, 11, 6};
        int n = arr.length;
        int k = 1;
        for(int i = 0; i < k; i++){
            for(int j = n - 1; i > 0; i--){
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

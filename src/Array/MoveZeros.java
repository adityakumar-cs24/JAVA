package Array;
import java.util.Arrays;
import java.util.Scanner;
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j <= i; j++){
                if(nums[i] == 0) continue;
                else arr[j] = nums[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//75
//121
//118
//283
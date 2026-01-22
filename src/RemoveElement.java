import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        int ans = removeElement(arr, val);
        for(int i = 0; i < arr.length; i++){
            System.out.print(i + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

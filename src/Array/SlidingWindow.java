package Array;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 5, 3};
        int k = 3;
        int currSum = 0;
        int maxSum;
        for(int i = 0; i < k; i++){
            currSum += arr[i];
        }
        maxSum = currSum;
        for(int right = k; right < arr.length; right++){
            currSum += arr[right] - arr[right - k];
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Max Sum : " + maxSum);
    }
}

package _0PRACTICE;

public class Secondlargest {
    public static void main(String[] args) {
        int[] arr = {1, 4, 15, 23, 32, 12, 6, 3};
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstmax){
                secondmax = firstmax;
                firstmax = arr[i];
            }
            else if(arr[i] > secondmax && arr[i] != firstmax){
                secondmax = arr[i];
            }
        }
        System.out.println(secondmax);
    }
}

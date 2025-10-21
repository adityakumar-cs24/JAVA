package _1EXAM;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,2,0,5,6};
        movezeros(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void movezeros(int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

}

package Array;
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int firstmax = arr[0];
        int secondmax = 0;
        int thirdmax = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] > firstmax){
                firstmax = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > secondmax && arr[i] != firstmax){
                secondmax = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > thirdmax && arr[i] != firstmax && arr[i] != secondmax){
                thirdmax = arr[i];
            }
        }
        System.out.println(firstmax + " " + secondmax + " " + thirdmax);
    }
}

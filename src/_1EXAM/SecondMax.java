package _1EXAM;
import java.util.Scanner;
public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > firstmax){
                secondmax = firstmax;
                firstmax = arr[i];
            }
            else if (arr[i] > secondmax && arr[i] != firstmax){
                secondmax = arr[i];
            }
        }
        if(secondmax == Integer.MIN_VALUE){
            System.out.println("There is no second largest");
        }
        else{
            System.out.println(secondmax);
        }
    }
}

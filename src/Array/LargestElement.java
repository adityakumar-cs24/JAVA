package Array;
import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i = 0; i < size; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element : " + largest);
    }
}

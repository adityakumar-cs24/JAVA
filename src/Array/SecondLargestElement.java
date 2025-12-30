package Array;
import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != firstMax){
                secondMax = arr[i];
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("No Second Max Element.");
        }
        else{
            System.out.println("Second Largest Element : " + secondMax);
        }
    }
}

package AtoZ_Sheet.Hashing;
import java.util.Scanner;
public class BasicHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //Precompute
        int[] hash = new int[13];
        for(int i = 0; i < n; i++){
            hash[arr[i]] += 1;
        }

        System.out.print("Enter size of inputs to check frequency : ");
        int q = sc.nextInt();
        int numbers;
        System.out.print("Enter elements to check frequency : ");
        for(int i = 0; i < q; i++){
            numbers = sc.nextInt();
            System.out.println("Frequency of " + numbers + " : " + hash[numbers]);
        }
    }
}

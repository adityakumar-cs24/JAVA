package AtoZ_Sheet.Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry x : freq.entrySet()){
            System.out.println(x.getKey() + " -> " + x.getValue());
        }
    }
}

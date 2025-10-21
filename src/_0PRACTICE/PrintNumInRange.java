package _0PRACTICE;
import java.util.Scanner;
public class PrintNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start No. : ");
        int low = sc.nextInt();
        System.out.print("Enter End No. : ");
        int high = sc.nextInt();
        System.out.println("All Numbers In Range from " + low + " to " + high + " : ");
        for(int i = low; i <= high; i++){
            System.out.print(i + " ");
        }
    }
}

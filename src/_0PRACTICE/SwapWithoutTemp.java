package _0PRACTICE;
import java.util.Scanner;
public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No. : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap , " + "a : " + a + " b : " + b);
    }
}

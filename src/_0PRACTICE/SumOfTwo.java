package _0PRACTICE;
import java.util.Scanner;
public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        int num2 = sc.nextInt();

        System.out.println("Sum of " + num1 + " and " + num2 + " : " + (num1 + num2));
    }
}

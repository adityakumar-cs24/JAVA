package _0PRACTICE;
import java.util.Scanner;
public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        int num2 = sc.nextInt();

        if(num1 > num2) System.out.print(num1 + " is Largest.");
        else if(num1 == num2) System.out.print(num1 + " and " + num2 + " both are equal.");
        else System.out.print(num2 + " is Largest.");
    }
}

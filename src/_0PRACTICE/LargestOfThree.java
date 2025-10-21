package _0PRACTICE;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd No. : ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3) System.out.print(num1 + " is Largest.");
        else if(num2 >= num1 && num2 >= num3) System.out.print(num2 + " is Largest.");
        else System.out.print(num3 + " is Largest.");
    }
}

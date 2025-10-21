package _0PRACTICE;
import java.util.Scanner;
public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        int num2 = sc.nextInt();
        int temp = 0;
        if (num1 == num2) System.out.print("Both numbers are equal.");
        else {
            temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.print("After Swapping , " + " num1 : " + num1 + " and " + "num2 : " + num2);
        }
    }
}

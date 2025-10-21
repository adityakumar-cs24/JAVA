package _0PRACTICE;
import java.util.Scanner;
public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        if(num > 0) System.out.print(num + " is Positive.");
        else if(num < 0) System.out.print(num + " is Negative.");
        else System.out.print(num + " is Zero.");
    }
}

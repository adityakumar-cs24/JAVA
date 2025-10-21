package _0PRACTICE;
import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        if(num % 2 == 0) System.out.print(num + " is Even.");
        else System.out.print(num + " is Odd.");
    }

}

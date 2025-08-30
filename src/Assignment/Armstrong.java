package Assignment;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result += (int) Math.pow(digit, digits);
            num = num / 10;
        }
        if (original == result) {
            System.out.println(original + " is Armstrong.");
        }
        else {
            System.out.println(original + " is not Armstrong.");
        }
    }
}

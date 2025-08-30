package Assignment;

import java.util.Scanner;

public class StrongNumber {
        static int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num  = input.nextInt();
            int original = num;
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum += factorial(digit);
                num = num / 10;
            }

            if (sum == original) {
                System.out.println(original + " is a Strong Number.");
            } else {
                System.out.println(original + " is NOT a Strong Number.");
            }
        }
}

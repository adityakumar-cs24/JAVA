package _1EXAM;
import java.util.*;
public class FibonacciInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting limit: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending limit: ");
        int end = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.println("Fibonacci numbers between " + start + " and " + end + " are:");

        while (a <= end) {
            if (a >= start)
                System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}

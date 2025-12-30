package AtoZ_Sheet.Recursion;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        System.out.println(fibonacci(num));

    }
    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        int last = fibonacci(num - 1);
        int slast = fibonacci(num - 2);
        return last + slast;
    }
}

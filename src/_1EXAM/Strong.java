package _1EXAM;
import java.util.Scanner;
public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if(sum == original) {
            System.out.println("Strong");
        }
        else {
            System.out.println("Not Strong");
        }
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}

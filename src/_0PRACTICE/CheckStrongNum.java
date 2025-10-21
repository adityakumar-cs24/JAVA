package _0PRACTICE;
import java.util.Scanner;
public class CheckStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. : ");
        int num = sc.nextInt();
        int original = num;
        int fact = 1;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        if(original == sum){
            System.out.println("Strong");
        }
        else{
            System.out.println("Not Strong");
        }

    }
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
}

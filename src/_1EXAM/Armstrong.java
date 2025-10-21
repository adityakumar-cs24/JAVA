package _1EXAM;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0){
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if(sum == original){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}

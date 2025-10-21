package _0PRACTICE;
import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        int original = num;
        int count = String.valueOf(num).length();

        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + (int)(Math.pow(digit, count));
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

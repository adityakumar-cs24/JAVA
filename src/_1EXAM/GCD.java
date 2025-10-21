package _1EXAM;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        int num2 = sc.nextInt();
        int result = gcd(num1, num2);
        System.out.println("GCD of "+ num1+" andn"+num2+" : "+result);
    }
    public static int gcd(int a, int b){

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

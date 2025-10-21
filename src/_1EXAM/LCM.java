package _1EXAM;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        int num2 = sc.nextInt();

        int result = lcm(num1, num2);
        System.out.println("LCM of "+num1+" and "+num2+" is : "+result);
    }

    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    public static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

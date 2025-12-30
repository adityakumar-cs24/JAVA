package AtoZ_Sheet.Maths;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        int num2 = sc.nextInt();
        int ans = gcd(num1, num2);
        System.out.println(ans);
    }
    public static int gcd(int a, int b){
        while(a > 0 && b > 0){
            if(a > b) a = a % b;
            else b = b % a;
        }
        if(a == 0) return b;
        return a;
    }
}

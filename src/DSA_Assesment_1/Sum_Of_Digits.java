package DSA_Assesment_1;
import java.util.Scanner;
public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum = sum + n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}

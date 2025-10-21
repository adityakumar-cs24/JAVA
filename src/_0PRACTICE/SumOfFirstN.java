package _0PRACTICE;
import java.util.Scanner;
public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

package _0PRACTICE;
import java.util.Scanner;
public class SumOfEvenUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 2; i <= n; i = i + 2){
            sum += i;
        }
        System.out.println(sum);
    }
}

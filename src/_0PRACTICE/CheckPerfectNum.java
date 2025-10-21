package _0PRACTICE;
import java.util.Scanner;
public class CheckPerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("Perfect Number.");
        }
        else{
            System.out.println("Not Perfect.");
        }
    }
}

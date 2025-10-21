package _1EXAM;
import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        int sq = num * num;
        int sum = 0;
        while (sq != 0){
            sum = sum + sq % 10;
            sq /= 10;
        }
        if(sum == num){
            System.out.println("Neon");
        }
        else{
            System.out.println("Not Neon");
        }
    }
}

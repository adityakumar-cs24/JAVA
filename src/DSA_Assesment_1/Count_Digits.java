package DSA_Assesment_1;
import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        int count = 0;
        while(n != 0){
            int rev = n % 10;
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}

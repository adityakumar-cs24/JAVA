package DSA_Assesment_1;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n <= 1) isPrime = false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}

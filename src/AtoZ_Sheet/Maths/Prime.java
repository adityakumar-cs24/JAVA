package AtoZ_Sheet.Maths;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num <= 1) isPrime = false;

        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

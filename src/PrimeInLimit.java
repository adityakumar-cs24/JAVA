import java.util.Scanner;
public class PrimeInLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower limit");
        int k = sc.nextInt();
        System.out.println("enter the upper limit");
        int n = sc.nextInt();
        for(int i = k; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j*j <= i ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                if(i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}

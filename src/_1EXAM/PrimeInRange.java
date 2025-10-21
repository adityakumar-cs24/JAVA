package _1EXAM;
import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit : ");
        int ll = sc.nextInt();
        System.out.print("Enter upper limit : ");
        int ul = sc.nextInt();

        for (int i = ll; i <= ul; i++) {
            if (i < 2) continue; // skip 0 and 1

            int flag = 1; // assume prime
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

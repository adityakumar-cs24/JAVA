package PATTERNS;
import java.util.Scanner;
public class HalfDiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();
        for(int i = 1; i <= 2 * n - 1; i++){
            int k = i > n ? 2 * n - i : i;
            for(int j = 1; j <= k; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

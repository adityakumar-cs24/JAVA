package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class IncreasingNumRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        int a = 1;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a + " ");
                a = a + 1;
            }
            System.out.println();
        }
    }
}

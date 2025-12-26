package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class AlphabetRightTriangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            int start = 64 + (rows - i + 1);
            for(int j = 1; j <= i; j++){
                System.out.print((char)start + " ");
                start++;
            }
            System.out.println();
        }
    }
}

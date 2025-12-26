package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class BinaryRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            int start = (i % 2 == 0) ? 1 : 0;
            for(int j = 0; j <= i; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}

package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class InvertedAlphabetRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        for(int i = 5; i >= 1; i--){
            int a = 65;
            for(int j = 1; j <= i; j++){
                System.out.print((char)a + " ");
                a += 1;
            }
            System.out.println();
        }
    }
}

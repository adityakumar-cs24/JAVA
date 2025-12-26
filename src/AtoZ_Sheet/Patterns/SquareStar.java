package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class SquareStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int rows = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

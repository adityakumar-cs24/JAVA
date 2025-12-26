package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class HalfDiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        for(int i = 1; i <= 2 * rows - 1; i++){
            int stars = i;
            if(i > rows) stars = 2 * rows - i;
            for(int j = 1; j <= stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


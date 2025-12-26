package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class FullDiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        int spaces = 2 * rows - 2;
        for(int i = 1; i <= 2 * rows - 1; i++){
            //Stars
            int stars = i;
            if(i > rows) stars = 2 * rows - i;
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            //Spaces
            for(int k = 1; k <= spaces; k++){
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i < rows) spaces -= 2;
            else spaces += 2;
        }
    }
}

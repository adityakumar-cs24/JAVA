package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class HollowDiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();


        int initspace = 0;
        for(int i = 0; i < rows; i++){
            // Stars
            for(int j = 1; j <= rows - i; j++){
                System.out.print("*");
            }
            // Spaces
            for(int k = 0; k < initspace; k++){
                System.out.print(" ");
            }
            //Stars
            for(int l = 1; l <= rows - i; l++){
                System.out.print("*");
            }
            initspace += 2;
            System.out.println();
        }


        int inis = 2 * rows - 2;
        for(int i = 1; i <= rows; i++){
            // Stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            // Spaces
            for(int k = 0; k < inis; k++){
                System.out.print(" ");
            }

            //Stars
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }
            inis -= 2;
            System.out.println();
        }
    }
}

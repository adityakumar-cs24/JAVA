package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class MountainNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            // Increasing Numbers
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            // Spaces
            for(int k = 1; k <= 2 * (rows - i); k++){
                System.out.print(" ");
            }
            // Decreasing Numbers
            for(int m = i; m >= 1; m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}

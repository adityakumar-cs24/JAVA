package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class NumberPattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        for(int i = 0; i < 2 * rows - 1; i++){
            for(int j = 0; j < 2 * rows - 1; j++){
                int top = i;
                int left = j;
                int right = (2 * rows - 2) - j;
                int down = (2 * rows - 2) - i;
                System.out.print(rows - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}

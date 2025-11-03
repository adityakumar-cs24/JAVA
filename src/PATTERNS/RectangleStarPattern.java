package PATTERNS;
import java.util.Scanner;
public class RectangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int c = sc.nextInt();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

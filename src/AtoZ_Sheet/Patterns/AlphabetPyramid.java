package AtoZ_Sheet.Patterns;
import java.util.Scanner;
public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows - i - 1; j++){
                System.out.print(" ");
            }
            int a = 65;
            int breakpoint = (2 * i + 1) / 2;
            for(int k = 1; k <= 2 * i + 1; k++){
                System.out.print((char)a);
                if(k <= breakpoint) a++;
                else a--;
            }
            for(int m = 0; m < rows - i - 1; m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

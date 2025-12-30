package AtoZ_Sheet.Backtracking;
import java.util.Scanner;
public class LinearlyFromNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        linear(1, num);
    }
    public static void linear(int current, int num){
        if(current > num) return;
        linear(current + 1, num);
        System.out.println(current);
    }
}
package AtoZ_Sheet.Recursion;
import java.util.Scanner;
public class LinearlyFromNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        linear(num);
    }
    public static void linear(int num){
        if(num < 1){
            return;
        }
        linear(num - 1);
        System.out.println(num);
    }
}


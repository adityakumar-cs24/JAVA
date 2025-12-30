package AtoZ_Sheet.Recursion;
import java.util.Scanner;
public class LinearlyFrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        linear(1, num);
    }
    public static void linear(int current, int num){
        if(current > num){
            return;
        }
        System.out.println(current);
        linear(current + 1, num);
    }
}

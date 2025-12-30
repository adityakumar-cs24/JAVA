package AtoZ_Sheet.Recursion;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int num){
        if(num == 1) return 1;
        return num + sum(num - 1);

    }
}

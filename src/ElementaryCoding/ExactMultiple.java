package ElementaryCoding;
import java.util.*;
public class ExactMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        int num2 = sc.nextInt();
        System.out.println(multiple(num1, num2));
    }
    public static int multiple(int num1, int num2){
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        if(num1 == 0 || num2 == 0) return 3;
        if(num1 % num2 == 0) return 2;
        return 1;
    }
}

package _1EXAM;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int a = 0, b = 0, c = 1;
        for(int i = 1; i <= num; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.println(a +"");
        }
    }
}

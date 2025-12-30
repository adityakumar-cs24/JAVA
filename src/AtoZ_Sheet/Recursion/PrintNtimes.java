package AtoZ_Sheet.Recursion;
import java.util.Scanner;
public class PrintNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        print(1,num);
    }
    public static void print(int i, int num){
        if(i > num){
            return;
        }
        System.out.println("Welcome To Recursion!!!");
        print(i+1, num);
    }
}

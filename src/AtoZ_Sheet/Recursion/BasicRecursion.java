package AtoZ_Sheet.Recursion;
import java.util.Scanner;
public class BasicRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text : ");
//        int num = sc.nextInt();
        String str = sc.nextLine();

        int count = 0;
        print(str, count);

    }
    public static void print(String str, int count){
        if(count == 5){
            return;
        }
        System.out.println(str);
        print(str, count + 1);
    }
}

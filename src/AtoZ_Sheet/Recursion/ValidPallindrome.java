package AtoZ_Sheet.Recursion;
import java.util.Scanner;
public class ValidPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        System.out.println(check(0, str));
    }
    public static boolean check(int i, String str){
        if(i >= str.length() / 2) return true;
        if(str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        return check(i + 1, str);
    }
}

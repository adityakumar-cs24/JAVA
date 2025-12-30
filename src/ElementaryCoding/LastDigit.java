package ElementaryCoding;
import java.util.*;
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. : ");
        int num = sc.nextInt();
        System.out.println(lastDigit(num));
    }
    public static int lastDigit(int num){
        return Math.abs(num % 10);
    }
}

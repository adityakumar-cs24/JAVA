package AtoZ_Sheet.Maths;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
//        int count = 0;
//        while(num > 0){
//            count++;
//            num /= 10;
//        }

        // Another method
        int count = (int) (Math.log10(num) + 1);       // time complexity :- O(log10(N))
        System.out.println(count);
    }
}

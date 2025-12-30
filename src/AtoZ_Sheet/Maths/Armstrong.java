package AtoZ_Sheet.Maths;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        int temp = num;
        int digits = (int)(Math.log10(num) + 1);
//        int digits = String.valueOf(num).length();
        int sum = 0;
        while(num > 0){
            int rev = num % 10;
            sum = sum + (int)(Math.pow(rev, digits));
            num /= 10;
        }
        if(temp == sum){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

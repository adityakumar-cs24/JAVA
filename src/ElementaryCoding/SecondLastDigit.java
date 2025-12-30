package ElementaryCoding;

import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. : ");
        int num = sc.nextInt();
        System.out.println(secondLastDigit(num));
    }
    public static int secondLastDigit(int num){
        return Math.abs(num / 10) % 10;
    }
}

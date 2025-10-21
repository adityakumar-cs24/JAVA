package _0PRACTICE;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. : ");
        int num = sc.nextInt();
        int product = 1;
        while(num != 0){
            int rev = num % 10;
            product = product * rev;
            num /= 10;
        }
        System.out.println(product);
    }
}

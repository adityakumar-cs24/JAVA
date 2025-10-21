package _0PRACTICE;

import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. : ");
        int num = sc.nextInt();
        int original = num;
        int res = 0;
        while(num != 0){
            int rev = num % 10;
            res = res * 10 + rev;
            num /= 10;
        }
        if(res == original){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

package AtoZ_Sheet.Maths;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if(temp == rev){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}

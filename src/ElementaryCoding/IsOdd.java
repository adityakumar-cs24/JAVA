package ElementaryCoding;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. : ");
        int num = sc.nextInt();
        System.out.println(odd(num));
    }

    public static int odd(int num){
        num = Math.abs(num);
        if(num % 2 != 0) return 2;
        return 1;
    }
}

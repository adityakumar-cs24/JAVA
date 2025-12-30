package ElementaryCoding;

import java.util.Scanner;

public class SumOfLastDigitOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        int num2 = sc.nextInt();
        System.out.println(Sum(num1, num2));
    }
    public static int Sum(int num1, int num2){
        return Math.abs(num1 % 10) + Math.abs(num2 % 10);

    }
}

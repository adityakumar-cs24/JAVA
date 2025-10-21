package _1EXAM;

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = input.nextInt();
        boolean flag = true;
        if (num <= 1){
            flag = false;
        }
//        else if (num == 2) {
//            flag = true;
//        }
        else{
            for(int i = 2; i <= num/2; i++) {
                if(num%i==0){
                    flag = false;
                    break;
                }

            }
        }
        if(flag){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

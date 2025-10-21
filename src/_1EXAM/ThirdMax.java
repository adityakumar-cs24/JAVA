package _1EXAM;

import java.util.Scanner;

public class ThirdMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > firstmax){
                thirdmax = secondmax;
                secondmax = firstmax;
                firstmax = arr[i];
            }
            else if (arr[i] > secondmax && arr[i] != firstmax){
                thirdmax = secondmax;
                secondmax = arr[i];
            }
            else if (arr[i] > thirdmax && arr[i] != secondmax && arr[i] != firstmax){
                thirdmax = arr[i];
            }
        }
        if(secondmax == Integer.MIN_VALUE && thirdmax == Integer.MIN_VALUE){
            System.out.println("There is no second and third largest element.");
        }
        else if(thirdmax == Integer.MIN_VALUE){
            System.out.println("there is no third largest element.");
        }
        else{
            System.out.println("Second Max : " + secondmax);
            System.out.println("Third Max : " + thirdmax);

        }
    }

}

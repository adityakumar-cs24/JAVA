package ElementaryCoding;
import java.util.*;
public class MostFrequentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No. : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd No. : ");
        int num3 = sc.nextInt();
        System.out.print("Enter 4th No. : ");
        int num4 = sc.nextInt();
        System.out.println(MostFrequentDigit(num1, num2, num3, num4));
    }
    public static int MostFrequentDigit(int input1, int input2, int input3, int input4) {
        int[] arr = {input1, input2, input3, input4};
        int[] freq = new int[10];  // To store frequency of digits 0-9

        // Count digit frequencies
        for (int num : arr) {
            if (num == 0) {
                freq[0]++; // If number itself is 0
            }
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }

        // Find the digit with maximum frequency
        int maxFreq = -1;
        int resultDigit = -1;

        for (int d = 0; d <= 9; d++) {
            if (freq[d] > maxFreq) {
                maxFreq = freq[d];
                resultDigit = d;
            }
            else if (freq[d] == maxFreq && d > resultDigit) {
                // Same frequency → choose the higher digit
                resultDigit = d;
            }
        }

        return resultDigit;
    }


}

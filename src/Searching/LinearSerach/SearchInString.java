package Searching.LinearSerach;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.print("Enter target : ");
        char target = input.next().charAt(0);

        System.out.println(search(str, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}

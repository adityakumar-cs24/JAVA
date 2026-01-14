package AtoZ_Sheet.Hashing;
import java.util.Scanner;
public class BasicHashing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();
        int[] hash = new int[26];
        for(int i = 0; i < str.length(); i++){
            hash[str.charAt(i) - 'a']++;
        }
        System.out.print("Enter size of inputs to check frequency : ");
        int q = sc.nextInt();
        System.out.print("Enter elements to check frequency : ");
        for(int i = 0; i < q; i++){
            String digits = sc.next();
            char ch = digits.charAt(0);
            System.out.println("Frequency of " + digits + " : " + hash[ch - 'a']);
        }
    }
}

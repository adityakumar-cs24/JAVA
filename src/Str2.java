import java.util.Scanner;
public class Str2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        for(int i = 1; i < str.length() - 1; i++) {
            ch = (char) (ch -'0' + i);
            if (ch != str.charAt(i)) System.out.println(ch); break;
        }
    }
}

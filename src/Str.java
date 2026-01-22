import java.util.Locale;
import java.util.Scanner;
public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        int v = 0;
        int c = 0;
        int d = 0;
        int sp = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    v++;
                }
                else{
                    c++;
                }
            }
            else if(ch - '0' >= 0 && ch - '0' <= 9){
                d++;
            }
            else{
                sp++;
            }
        }
        System.out.println(v + " " + c + " " + d + " " + sp);
    }
}

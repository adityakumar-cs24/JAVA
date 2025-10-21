package Basic;
import java.util.Scanner;
public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ch = 0;

            }
        }
        System.out.println(str);

    }
}

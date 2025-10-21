package Basic;
import java.util.Scanner;
public class n_prime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int rev = 0;
        for(int i = low; i!=0;i=i/10)
        {
            rev = rev * 10 + i % 10;
        }
        System.out.println(rev);
    }
}

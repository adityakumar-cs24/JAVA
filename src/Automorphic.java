import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        int temp = n;
        int power = 1;

        while(temp > 0){
            power *= 10;
            temp /= 10;
        }
        if(sq % power == n){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }
    }
}

package Basic;

public class Palin {
    public static void main(String[] args) {
        int n = 1221;
        int temp = n;
        int rev = 0;
        while (n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if(temp == rev){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
}


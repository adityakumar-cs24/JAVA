package _0PRACTICE;

public class HappyNum {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n){
        if(n == 1 || n == 7) return true;
        if(n < 10) return false;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return isHappy(sum);
    }
}

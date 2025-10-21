package Basic;

public class Reverse {
    public static void main(String[] args) {
        int n = 12345;
        for (int i = n;i > 0;){
            n = n * 10 + i % 10;
            i /= 10;

        }
        System.out.println(n);
    }
}

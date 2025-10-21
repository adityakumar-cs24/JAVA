package Basic;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        String binary = "";
        while(temp > 0){
            int rem = temp % 2;
            binary = rem + binary;
            temp = temp / 2;
        }
        System.out.println(binary);

        String onesComplement = "";
        for(int i = 0; i < binary.length(); i++){
            char bit = binary.charAt(i);
            if(bit == '1'){
                onesComplement += '0';
            }
            else{
                onesComplement += '1';
            }
        }
        System.out.println(onesComplement);

        int complementDecimal = 0;
        int power = 0;
        for(int i = onesComplement.length() - 1; i >= 0; i--){
            int bit = onesComplement.charAt(i) - '0';
            complementDecimal += bit * Math.pow(2, power);
            power++;
        }
        System.out.println(complementDecimal);
    }
}

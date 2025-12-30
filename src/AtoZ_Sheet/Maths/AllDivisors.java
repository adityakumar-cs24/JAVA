package AtoZ_Sheet.Maths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                list.add(i);
                if((num / i) != i){
                    list.add((num/i));
                }
            }
        }
        Collections.sort(list);
        System.out.print(list);
    }
}

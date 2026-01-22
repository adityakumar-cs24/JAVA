import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int oddcount = 0;
        int evencount = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] % 2 == 0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println(evencount + " " + oddcount);

    }
}

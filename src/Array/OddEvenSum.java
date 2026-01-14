package Array;
import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.print("Enter no. of elements : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int oddsum = 0;
        int evensum = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] % 2 != 0){
                    oddsum += arr[i][j];
                }
                else{
                    evensum += arr[i][j];
                }
            }
        }
        System.out.println("OddSum : " + oddsum);
        System.out.println("EvenSum : " + evensum);
    }
}

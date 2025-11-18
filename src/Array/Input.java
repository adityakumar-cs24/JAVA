package Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // type 1 :- To input elements of an array.
        // this is array of primitives.
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 34;
        arr[4] = 56;
        for(int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(234);
//        list.toString();
        System.out.println(list);

    }
}

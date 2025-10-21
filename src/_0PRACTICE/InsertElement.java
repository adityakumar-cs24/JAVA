package _0PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 12, 32, 3, 8, 23};
        int pos = 5;
        int element = 39;

//        int[] newarr = new int[arr.length + 1];
//
//        for(int i = 0; i < arr.length; i++){
//            newarr[i] = arr[i];
//        }
//
//        newarr[pos] = element;
//        for(int i = pos; i < arr.length; i++){
//            newarr[i + 1] = arr[i];
//        }
//
//        for(int num : newarr){
//            System.out.print(num + " ");
//        }

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 12, 32, 3, 8, 23));
        list.add(pos, element);
        System.out.println(list);
    }
}

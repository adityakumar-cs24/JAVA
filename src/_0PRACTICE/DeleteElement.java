package _0PRACTICE;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 12, 32, 3, 8, 23};
        int pos = 5;
//        int element = 39;

//        int[] newarr = new int[arr.length + 1];

//        for (int i = 0; i < arr.length; i++) {
//            newarr[i] = arr[i];
//        }
//
//        newarr[pos] = element;
//        for (int i = pos; i < arr.length; i++) {
//            newarr[i + 1] = arr[i];
//        }

        for (int i = 0; i < arr.length; i++) {
            if(i == pos) continue;
            System.out.print(arr[i] + " ");
        }

    }
}
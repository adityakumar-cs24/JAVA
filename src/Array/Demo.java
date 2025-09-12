package Array;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,5};
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for ( int j = i + 1; j < arr.length - 1; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
                for(int k = 0; k < arr.length-1; k++) {
                    System.out.println(count);
                }
            }


        }

    }
}

package Array;

public class BasicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,5};
        int target = 1;
        int[] brr = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                continue;
            }
            else {
                for (int j = 0; j < brr.length; j++) {
                    brr[j] = arr[i];
                    break;
                }
            }
//            System.out.print(arr[i] + " ");


        }
        System.out.println(brr);


    }

}

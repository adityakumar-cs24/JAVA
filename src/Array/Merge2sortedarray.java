package Array;

import java.util.Scanner;

public class Merge2sortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array1 : ");
        int p = sc.nextInt();
        int[] arr1 = new int[p];
        System.out.println("insert the values of array1 :");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter the size of array2 : ");
        int q = sc.nextInt();
        int[] arr2 = new int[q];
        System.out.println("insert the values of array2 : ");
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i]= sc.nextInt();
        }
        int[] arr3 = new int[arr1.length+arr2.length];

        int i=0 ,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length) arr3[k++]=arr1[i++];
        while(j<arr2.length) arr3[k++]=arr2[j++];
        for (int l = 0; l < arr3.length ; l++) {
            System.out.print(arr3[l]+" ");
        }
    }
}

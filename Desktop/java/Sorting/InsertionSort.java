package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2 ,1, 3, 1, 2};
        Insert(arr);

    }
    static void Insert(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

package Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,3,5,2,4,6};
        int n= arr.length;
        // for(int i=1;i<n;i++){
        //     int key=arr[i];
        //     int j=i-1;
        //     while(j>=0 && arr[j]>key){
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        //     arr[j+1]=key;
        // }
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

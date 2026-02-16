package Sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

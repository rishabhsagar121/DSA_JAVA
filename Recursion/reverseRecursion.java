package Recursion;
import java.util.Arrays;

public class reverseRecursion {
    static void reverse(int[] arr,int left,int right){
        if(left>=right) return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr,left+1,right-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int l = 0;
        int r = arr.length-1;
        
        reverse(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
}

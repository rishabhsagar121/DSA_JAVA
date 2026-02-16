package Basics;
import java.util.Arrays;

public class removeduplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,5};
        int n = arr.length;
        int count = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]) count++;
        }
        int[] newArr = new int[count];
        newArr[0] = arr[0];
        int c=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                newArr[c] = arr[i];
                c++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}

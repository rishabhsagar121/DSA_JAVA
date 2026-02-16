import java.util.*;
public class TargetSum {

     public static void main(String[] args) {
        int[] arr = {2,1,7,8,5,4,3};
        int k=6;
        int[] sum = targetSum(arr,k);
        System.err.println(Arrays.toString(sum));
    
    }
    public static int[] targetSum(int[] arr ,int k){
        int n = arr.length;
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==k){
                return new int[]{left,right};
            }else if(sum<k){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
   
}

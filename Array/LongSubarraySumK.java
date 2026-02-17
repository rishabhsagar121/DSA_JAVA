// Not Worked

// public class LongSubarraySumK {
//     public static void main(String[] args) {
//         int[] arr={1,2,3,1,1,1,1,4,2,3};
//         int n=arr.length;
//         int k=3, sum=0 ,count=0 ,ncount=0;
//         for(int i=0;i<n;i++){
//             sum+=arr[i];
//             count++;
//             if(sum==k){
//                 if(count>ncount){
//                     ncount = count;
//                 }
//                 sum=0;
//                 count=0;
//                 i--;
//             }
//             if(sum>k){
//                 sum = 0;
//                 count = 0;
//                 i--;
//             }
//         }
//         System.out.println(ncount);
//     }    
// }

// Another code:-

import java.util.HashMap;

public class LongSubarraySumK{
    public static int SubarraySumK(int[] arr,int k){
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum=0,maxLen=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==k){
                maxLen = i+1;
            }

            if(map.containsKey(sum-k)){
                int LongSubArr = i-map.get(sum-k);
                maxLen = Math.max(LongSubArr, maxLen);
            }

             if(!map.containsKey(sum)){
                map.put(sum,i);
             }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 15;
        int LongSubArr = SubarraySumK(arr, k);
        System.out.println(LongSubArr);
    }
}
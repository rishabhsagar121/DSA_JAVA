import java.util.Scanner;

// public class SubarraySumK {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int k=sc.nextInt();
//         int[] arr ={2,3,1,8,7,5,4};
//         int n=arr.length;
//         int max=0;
//         for(int i=2;i<n;i++){
//             if(max<arr[i]+arr[i-1]+arr[i]){
//                 max = arr[i]+arr[i-1]+arr[i-2];
//             }
//         }
//         System.out.println(max);
//     }
// }

public class SubarraySumK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr ={2,3,1,8,7,5,4};
        int n=arr.length;
        int max=0;
        int pmax = 0;
        for(int i=n-k;i>=0;i--){
            int count = i;
            for(int j=0;j<k;j++){
                max+=arr[count];
                count++;
            }
            if(max>pmax){
                pmax=max;
            }
            max=0;
        }
        System.out.println(pmax);
    }
}
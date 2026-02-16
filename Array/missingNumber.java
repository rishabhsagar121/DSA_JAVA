// public class missingNumber {
//     public static void main(String[] args) {
//         int[] arr = {1,2,4,5};
//         int n = arr.length;
//         int[] hash = new int[n+2];

//         for(int i=0;i<n;i++){
//             hash[arr[i]]=1;
//         }

//         for(int i=0;i<=n;i++){
//             if(hash[i] == 0){
//                 System.out.print(i);
//             }
//         }
//     }    
// }


// public class missingNumber{
//     public static void main(String[] args) {
//         int[] arr = {1,2,4,5};
//         int n = arr.length;

//         int sum=0;
//         for(int i=1;i<=n+1;i++){
//             sum += i;
//         }

//         int arrSum = 0;
//         for(int i: arr){
//             arrSum += i;
//         }

//         System.out.println(sum-arrSum);
//     }
// }


// public class missingNumber{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,5,6};
//         int n = arr.length+1;

//         int sum = (n*(n+1))/2;

//         int arrSum = 0;
//         for(int x:arr){
//             arrSum += x;
//         }

//         System.out.println(sum-arrSum);
//     }
// }


public class missingNumber{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = arr.length+1;

        int xor1 =0;
        int xor2 = 0;

        for(int i=0;i<arr.length;i++){
            xor1 = xor1^arr[i];
            xor2 = xor2^i+1;
        }

        int missing = xor1 ^ xor2;
        System.out.println(missing);
    }
}

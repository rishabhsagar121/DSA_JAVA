public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5};
        int num = missing(arr);
        System.out.println(num);
    }
    public static int missing(int[] arr){
        int n=arr.length;
        int xor = 0;
        for(int i=0;i<n;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}

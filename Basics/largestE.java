package Basics;
class largestE{
    public static void main(String[] args){
        int[] arr={3,2,1,5,4,7};
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
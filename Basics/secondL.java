package Basics;
public class secondL {
    public static void main(String[] args) {
        int[] arr= {3,1,2,6,8,5};
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest); 
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(secondLargest<arr[i] && arr[i]<largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest); 
    }
}

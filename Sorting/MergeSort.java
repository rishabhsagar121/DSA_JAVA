public class MergeSort{
    public static void main(String[] args) {
        int[] arr= {3,2,1,4,5};
        int n = arr.length;

        mergesort(arr,0,n-1);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    static void mergesort(int[] arr, int low, int high) {
        if(low<high){
            int mid = (low+high)/2;

            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);

            merge(arr,low,mid,high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] larr = new int[n1];
        int[] harr = new int[n2];

        for(int x=0;x<n1;x++){
            larr[x] = arr[x+low];
        }
        
        for(int x=0;x<n2;x++){
            harr[x] = arr[x+mid+1];
        }
        
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(larr[i]<harr[j]){
                arr[k]=larr[i];
                i++;
            }else{
                arr[k]=harr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=harr[j];
            j++;
            k++;
        }
    }
}

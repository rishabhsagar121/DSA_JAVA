//union of two sorted array
// public class union {
//     public static void main(String[] args) {
//         int[] arr1= {1,1,2,3,4,5};
//         int[] arr2= {2,3,4,4,5,6};
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int k=0,j=0;

//         int n = n1+n2;
//         int[] arr3 = new int[n];
//         int maxl = n1>=n2 ? n1:n2;
//         for(int i=0;i<n;i++){
//             if(n1>i){
//                 arr3[i]=arr1[k];
//                 k++;
//             }
//             else{
//                 arr3[i] = arr2[j];
//                 j++;
//             }
//         }
        
//         for(int i=0;i<=arr3.length;i++){
//             for(int l=0;l<arr3.length-1-i;l++){
//                 if(arr3[l]>arr3[l+1]){
//                     int temp = arr3[l+1];
//                     arr3[l+1] = arr3[l];
//                     arr3[l] = temp;
//                 }
//             }
//         }
//         for (int i : arr3) {
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         int count=1;
//         for(int i=1;i<arr3.length;i++){
//             if(arr3[i]!=arr3[i-1]){
//                 count++;
//             }
//         }
        
//         int[] arr4 = new int[count];
//         int newcount = 0;
//         for(int i=0;i<arr3.length-1;i++){
//             if(arr3[i]!=arr3[i+1]){
//                 arr4[newcount] = arr3[i];
//                 newcount++;
//             }
//         }
//         arr4[newcount] = arr3[arr3.length-1];

//         for (int i : arr4) {
//             System.out.print(i+" ");
//         }
//     }
// }


// Not completed .

// public class union{
//     public static void main(String[] args) {
//         int[] arr1 = {1,1,2,3,4,5};
//         int[] arr2 = {2,3,4,4,5,6};

//         int n1=arr1.length;
//         int n2=arr2.length;

//         int count=0,x=0,y=0;

//         while(x<n1 && y<n2){
//             if(arr1[x]==arr2[y]){
//                 count++;
//                 x++;
//                 y++;
//             }else if(arr1[x]<arr2[y]){
//                 count++;
//                 x++;
//             }else if(arr1[x]>arr2[y]){
//                 count++;
//                 y++;
//             }
//         }

//         while(x<n1){
//             count++;
//             x++;
//         }
//         while(y<n2){
//             count++;
//             y++;
//         }
//         System.out.println(count);
//     }
// }

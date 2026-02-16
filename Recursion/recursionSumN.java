package Recursion;
// Paramterized

// public class recursionSumN {
//     public static void sum(int i,int total){
//         if(i == 0){
//             System.out.println(total);
//             return;
//         }
//         sum(i-1,total+i);
//     }
//     public static void main(String[] args) {
//         int total=0;
//         sum(5,total);
//     }    
// }

//functional

public class recursionSumN{
    static int sum(int n){
        if(n==0) return 0;

        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
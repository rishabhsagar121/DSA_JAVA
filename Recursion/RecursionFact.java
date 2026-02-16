package Recursion;
// Functional

// public class RecursionFact {
//     static int fact(int n){
//         if(n==0) return 1;

//         return n * fact(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fact(n));
//     }
// }

// Parameterized

public class RecursionFact{
    static void fact(int i, int fact){
        if(i == 1){
            System.out.println(fact);
            return;
        }

        fact(i-1,fact*i);
    }
    public static void main(String[] args) {
        int n = 1;
        fact(5,n);
    }
}
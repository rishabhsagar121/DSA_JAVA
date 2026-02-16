package Recursion;
public class recursionFibonnaci {
    static int fibonnaci(int n){
        // if(n<=2) return 1;
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonnaci(n-1)+fibonnaci(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonnaci(n));
    }
}

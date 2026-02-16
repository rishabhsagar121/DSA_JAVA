package Recursion;
public class recursionSum {
    public static void sum(int n){
        if(n==0) return;

        sum(n-1);
        int numSum = n;
        System.out.println(numSum+n);
    }
    public static void main(String[] args) {
        int n=5;
        sum(n);
    }
}

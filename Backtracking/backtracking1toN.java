package Backtracking;
public class backtracking1toN {
    public static void printf(int n){
        if(n==0) return;

        printf(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=5;
        printf(n);
    }
}

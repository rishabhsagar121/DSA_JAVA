package Recursion;
public class recursionNto1 {
    public static void count(int n){
        if(0 == n)return; 

        System.out.println(n);
        count(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        count(n);
    }
}

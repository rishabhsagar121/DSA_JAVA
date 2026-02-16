package Recursion;
public class recursionName {
    public static void printf(int n){
        if(n==3) return;

        System.out.println("rishabh");
        n++;
        printf(n);

    }
    public static void main(String[] args) {
        int n = 0;
        printf(n);
    }
}

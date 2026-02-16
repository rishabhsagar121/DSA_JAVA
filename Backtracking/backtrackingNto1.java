package Backtracking;
public class backtrackingNto1 {
    public static void printf(int i,int n){
        
        if(n<i) return;
        printf(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        int n=8;
        printf(1,n);
    }    
}

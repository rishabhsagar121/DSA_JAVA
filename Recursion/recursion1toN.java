public class recursion1toN {
    public static void count(int i,int n){
        if(i == n+1)return; 

        System.out.println(i);
        // i++;
        count(i+1,n);
    }
    public static void main(String[] args) {
        int i=1;
        int n=10;
        count(i,n);
    }
}

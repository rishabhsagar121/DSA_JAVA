import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] twoDArray = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                twoDArray[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }
    }    
}

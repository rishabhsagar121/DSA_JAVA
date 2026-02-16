package Hashing;
import java.util.Scanner;
public class Numberhashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,1,1,2,3,8};
        int n = arr.length;
        int[] hash = new int[10];

        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        System.out.println("Enter numbers - ");
        int no = sc.nextInt();
        System.out.println(hash[no]);
    }
}

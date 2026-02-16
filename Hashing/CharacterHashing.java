package Hashing;
import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "rishabh@123123";
        int[] hash = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hash[ch]++;
        }       
        
        System.out.println("Enter a character : ");
        char d = sc.next().charAt(0);
        // int c = d - 'a';
        
        System.out.println(hash[d]);
    }
}

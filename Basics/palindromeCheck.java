package Basics;
public class palindromeCheck {
    static boolean checkPalindrome(char[] arr,int left,int right){
        if(left >= right) return true;

        if(arr[left] != arr[right]) return false;

        return checkPalindrome(arr, left+1, right-1);
        
    }
    public static void main(String[] args) {
        String s = "madam";
        char[] arr = s.toCharArray();
        int n= arr.length-1;
        System.out.println(checkPalindrome(arr,0,n));

    }
}

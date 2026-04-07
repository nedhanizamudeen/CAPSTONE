package String;

public class TwoPointer {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
    TwoPointer obj = new TwoPointer();

    String s = "madam";

    boolean result = obj.isPalindrome(s);

    if (result) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome");
    }
}
}

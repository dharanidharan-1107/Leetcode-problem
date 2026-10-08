class Solution{
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) return false;

        int original = x;
        long reversed = 0; // use long to avoid overflow

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int x1 = 121;
        System.out.println("Input: " + x1 + " → " + isPalindrome(x1)); // true

        int x2 = -121;
        System.out.println("Input: " + x2 + " → " + isPalindrome(x2)); // false

        int x3 = 10;
        System.out.println("Input: " + x3 + " → " + isPalindrome(x3)); // false
    }
}

        
    

class Solution {
    public static boolean isPalindrome(int x) {
        // Convert the integer to a string
        String str = Integer.toString(x);
        
        // Use two pointers to compare characters from the start and end of the string
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // All characters matched, it's a palindrome
    }
}
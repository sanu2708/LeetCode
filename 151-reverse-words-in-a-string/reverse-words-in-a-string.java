class Solution {
   public static String reverseWords(String s) {
        // Split the input string into words using one or more spaces as the delimiter
        String[] words = s.trim().split("\\s+");

        // Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a single space between words
            }
        }

        return reversed.toString();
    }
}
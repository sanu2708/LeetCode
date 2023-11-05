class Solution {
   public String removeDuplicateLetters(String s) {
        int[] lastOccurrence = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();

        // Store the last occurrence index of each character in the string
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Skip characters that have already been seen
            if (seen[currentChar - 'a']) {
                continue;
            }

            // Pop characters from the stack if:
            // 1. They are greater than the current character in lexicographical order.
            // 2. There are more occurrences of them later in the string.
            while (!stack.isEmpty() && currentChar < stack.peek() && i < lastOccurrence[stack.peek() - 'a']) {
                seen[stack.pop() - 'a'] = false;
            }

            stack.push(currentChar);
            seen[currentChar - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

}
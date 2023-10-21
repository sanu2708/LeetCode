class Solution {
    public int longestValidParentheses(String s) {
    Stack<Integer> stack = new Stack<>();
    stack.push(-1); // Initialize with -1 as a base element in the stack
    int maxLen = 0;

    for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);

        if (currentChar == '(') {
            stack.push(i);
        } else {
            // Pop the last opening parenthesis index from the stack
            stack.pop();
            if (stack.isEmpty()) {
                // If the stack is empty, push the current index as a new base
                stack.push(i);
            } else {
                // Calculate the length of the valid parentheses substring
                maxLen = Math.max(maxLen, i - stack.peek());
            }
        }
    }

    return maxLen;
}
}
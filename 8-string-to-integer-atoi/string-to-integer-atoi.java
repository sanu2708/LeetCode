class Solution {
    public int myAtoi(String s) {
    int index = 0;
    int sign = 1;
    int result = 0;

    // Step 1: Ignore leading whitespace
    while (index < s.length() && Character.isWhitespace(s.charAt(index))) {
        index++;
    }

    // Step 2: Check for '+' or '-'
    if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
        sign = (s.charAt(index) == '-') ? -1 : 1;
        index++;
    }

    // Step 3: Read in the characters until the next non-digit character
    while (index < s.length() && Character.isDigit(s.charAt(index))) {
        int digit = s.charAt(index) - '0';

        // Step 4: Check for integer overflow
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result * 10 + digit;
        index++;
    }

    // Step 5: Apply sign and return the result
    return result * sign;
}

}
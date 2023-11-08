class Solution {
    public int[] plusOne(int[] digits) {
    int n = digits.length;
    
    // Iterate from the least significant digit to the most significant digit
    for (int i = n - 1; i >= 0; i--) {
        // Increment the current digit
        digits[i]++;
        
        // If the digit becomes 10, set it to 0 and continue to the next more significant digit
        if (digits[i] == 10) {
            digits[i] = 0;
        } else {
            // If the current digit is not 10, no need to carry over, so we can return the result
            return digits;
        }
    }
    
    // If we reached here, it means we need to carry over a 1 to the most significant digit
    int[] result = new int[n + 1];
    result[0] = 1; // Set the most significant digit to 1
    for (int i = 1; i < n + 1; i++) {
        result[i] = digits[i - 1]; // Copy the original digits to the result
    }
    
    return result;
}
}
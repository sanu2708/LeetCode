class Solution {
  public boolean isPowerOfFour(int n) {
    // Check if n is a positive power of two
    if (n <= 0 || (n & (n - 1)) != 0) {
        return false;
    }
    
    // Check if the count of trailing zeroes is even
    int countZeros = 0;
    while (n > 1) {
        n >>= 1;
        countZeros++;
    }
    
    return countZeros % 2 == 0;
}
}
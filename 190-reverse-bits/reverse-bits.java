public class Solution {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>>= 1; // Use unsigned right shift to fill with zeros
        }
        return result;
    }
}
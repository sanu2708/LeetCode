class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // If the needle is an empty string, return 0.
        }
        
        int hayLen = haystack.length();
        int needleLen = needle.length();
        
        for (int i = 0; i <= hayLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i; // Found a match, return the starting index.
            }
        }
        
        return -1; // No match found, return -1.
    }
}

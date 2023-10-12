class Solution {
    public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
        return "";
    }

    int minLength = Integer.MAX_VALUE;

    // Find the length of the shortest string in the array
    for (String str : strs) {
        if (str.length() < minLength) {
            minLength = str.length();
        }
    }

    StringBuilder commonPrefix = new StringBuilder();

    // Compare characters at the same position in all strings
    for (int i = 0; i < minLength; i++) {
        char currentChar = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) != currentChar) {
                return commonPrefix.toString();
            }
        }
        commonPrefix.append(currentChar);
    }

    return commonPrefix.toString();
}
}
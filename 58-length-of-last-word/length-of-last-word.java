class Solution {
   public int lengthOfLastWord(String s) {
    // Split the string by spaces
    String[] words = s.split(" ");
    
    // Initialize a variable to store the length of the last word
    int length = 0;
    
    // Traverse the words from the end to find the last non-empty word
    for (int i = words.length - 1; i >= 0; i--) {
        if (!words[i].isEmpty()) {
            length = words[i].length();
            break;
        }
    }
    
    return length;
}
}
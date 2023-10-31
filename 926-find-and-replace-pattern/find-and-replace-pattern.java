class Solution {
   public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (matchesPattern(word, pattern)) {
                result.add(word);
            }
        }
        
        return result;
    }
    
    private boolean matchesPattern(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        
        Map<Character, Character> charMapping = new HashMap<>();
        Map<Character, Character> reverseMapping = new HashMap<>();
        
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            
            if (!charMapping.containsKey(w)) {
                charMapping.put(w, p);
            } else if (charMapping.get(w) != p) {
                return false;
            }
            
            if (!reverseMapping.containsKey(p)) {
                reverseMapping.put(p, w);
            } else if (reverseMapping.get(p) != w) {
                return false;
            }
        }
        
        return true;
    }
}
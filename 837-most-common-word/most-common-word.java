class Solution {
   public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }
        
        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        Map<String, Integer> wordCount = new HashMap<>();
        String mostFrequentWord = "";
        int maxCount = 0;
        
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                if (wordCount.get(word) > maxCount) {
                    mostFrequentWord = word;
                    maxCount = wordCount.get(word);
                }
            }
        }
        
        return mostFrequentWord;
    }

}
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // Create a mapping of digits to corresponding letters
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
        
        // Call the DFS helper function to generate combinations
        generateCombinations(digits, 0, new StringBuilder(), result, digitToLetters);
        
        return result;
    }
    
    private void generateCombinations(String digits, int index, StringBuilder current, List<String> result, Map<Character, String> digitToLetters) {
        // Base case: if the current combination has the same length as the input digits, add it to the result
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);
        
        // Iterate through the letters corresponding to the current digit
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            generateCombinations(digits, index + 1, current, result, digitToLetters);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
}
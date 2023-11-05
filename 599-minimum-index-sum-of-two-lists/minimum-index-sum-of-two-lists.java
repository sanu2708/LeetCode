class Solution {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> indexSumMap = new HashMap<>();
        int minIndexSum = Integer.MAX_VALUE;

        // Store the indices of strings from list1 in the indexSumMap
        for (int i = 0; i < list1.length; i++) {
            indexSumMap.put(list1[i], i);
        }

        List<String> commonStrings = new ArrayList<>();

        // Iterate through list2 and check for common strings
        for (int j = 0; j < list2.length; j++) {
            if (indexSumMap.containsKey(list2[j])) {
                int indexSum = j + indexSumMap.get(list2[j]);

                // Check if the current index sum is smaller than the minimum found so far
                if (indexSum < minIndexSum) {
                    commonStrings.clear(); // Clear the previous common strings
                    commonStrings.add(list2[j]);
                    minIndexSum = indexSum;
                } else if (indexSum == minIndexSum) {
                    commonStrings.add(list2[j]);
                }
            }
        }

        // Convert the list of common strings to an array
        return commonStrings.toArray(new String[0]);
    }
}
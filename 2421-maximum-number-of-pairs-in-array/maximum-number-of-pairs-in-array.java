class Solution {
   public static int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int pairs = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int count : frequencyMap.values()) {
            pairs += count / 2;
        }

        int leftOver = nums.length - pairs * 2;
        return new int[]{pairs, leftOver};
    }
}
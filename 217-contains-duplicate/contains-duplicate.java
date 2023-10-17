class Solution {
    public boolean containsDuplicate(int[] nums) {
         // Create a set to store the unique elements of the array.
        Set<Integer> set = new HashSet<>();

        // Iterate through the array and add each element to the set.
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }

        // If we reach this point, then no element appears at least twice in the array.
        return false;
    }
}
class Solution {
   public int removeElement(int[] nums, int val) {
    int k = 0; // Initialize a variable to count elements not equal to val.

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[k] = nums[i]; // Move the non-val element to the front of the array.
            k++; // Increment the count of non-val elements.
        }
    }

    return k; // Return the count of elements not equal to val.
}
}
class Solution {
     public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the input array in ascending order.
        int closestSum = Integer.MAX_VALUE / 2; // Initialize closestSum to a large value.

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1; // Initialize two pointers.

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right]; // Calculate the current sum.
                // Check if the current sum is closer to the target than the current closest sum.
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++; // Move the left pointer to the right to increase the sum.
                } else if (currentSum > target) {
                    right--; // Move the right pointer to the left to decrease the sum.
                } else {
                    return target; // Found an exact match, return the target.
                }
            }
        }

        return closestSum;
        
    }
}
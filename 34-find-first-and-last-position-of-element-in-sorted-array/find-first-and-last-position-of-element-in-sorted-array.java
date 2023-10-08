class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find the leftmost index where target appears
        int left = findLeft(nums, target);
        
        // If target is not found, return [-1, -1]
        if (left == -1) {
            return result;
        }
        
        // Find the rightmost index where target appears
        int right = findRight(nums, target);
        
        result[0] = left;
        result[1] = right;
        
        return result;
    }

    private int findLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }

        return index;
    }

    private int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }

        return index;
    }
}

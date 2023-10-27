class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        
        // Find the median
        int median = findKthLargest(nums, (n + 1) / 2);
        
        int left = 0, i = 0, right = n - 1;
        
        while (i <= right) {
            int mappedIndex = mapIndex(i, n);
            if (nums[mappedIndex] > median) {
                swap(nums, mapIndex(i, n), mapIndex(left, n));
                i++;
                left++;
            } else if (nums[mappedIndex] < median) {
                swap(nums, mapIndex(i, n), mapIndex(right, n));
                right--;
            } else {
                i++;
            }
        }
    }
    
    private int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k - 1];
    }
    
    private int mapIndex(int i, int n) {
        // Maps an index to its final position after the wiggle sort
        return (2 * i + 1) % (n | 1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
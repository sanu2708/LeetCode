class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         // Create a pointer to iterate through the merged array.
        int i = m - 1;

        // Create two pointers to iterate through the two sorted arrays.
        int j = n - 1;
        int k = m + n - 1;

        // Merge the two sorted arrays into the merged array.
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }
        
    }
}
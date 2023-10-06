class Solution {
    public String largestNumber(int[] nums) {
        // Convert int array to String array
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }
        
        // Custom comparison to sort in a way that forms the largest number
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        
        // Handle cases where all zeros are in the input
        if (numStrs[0].equals("0")) {
            return "0";
        }
        
        // Concatenate the sorted strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String numStr : numStrs) {
            result.append(numStr);
        }
        
        return result.toString();
    }
}
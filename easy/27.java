class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // Check if current element is equal to val
            if (nums[i] != val) {
                // If not then keep this num in the array and increment
                nums[count] = nums[i];
                count++;  
            }
        }
        return count;
    }
}
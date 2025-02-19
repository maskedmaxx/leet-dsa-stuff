class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize the array count to keep track of the position    where the next unique element should be placed in the array
        int count = 0;

        // Loop through all the elements of the array using
        for (int i = 0; i < nums.length; i++) {
            // Check if current element is equal to the next element
            // i < nums.length - 1 ensures we dont go out of bounds
            // nums[i] == nums[i + 1] checks if current element is equal to the next one
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // If current element is not a duplicate, it is stored at nums[count]
            // count is then incremeented so the next unique element is placed at the next pos
            nums[count] = nums[i];
            count++; 
        }
        // count now returns the num of unique elements in modified array
        return count;
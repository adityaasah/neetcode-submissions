class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
       int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int l = 0;
       for (int r = 0; r < nums.length; r++) {
            sum += nums[r]; // Add current element to sum

            // While the sum is valid, try to shrink the window from the left
            while (sum >= target) {
                minLen = Math.min(minLen, r - l + 1); // Update the minimum length
                sum -= nums[l]; // Subtract the left element
                l++; // Shrink window
            }
        }
       return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
        
    }
}
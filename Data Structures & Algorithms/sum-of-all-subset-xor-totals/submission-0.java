class Solution {
    public int subsetXORSum(int[] nums) 
    {   int xor = 0;

        for (int num : nums) {
            xor |= num;
        }

        return xor << (nums.length - 1);

        
    }
}
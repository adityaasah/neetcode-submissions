class Solution {
    public boolean canJump(int[] nums) 
    {
        int goal=nums.length-1;
       
       for (int p = nums.length - 2; p >= 0; p--)
        {
            if(p+nums[p]>=goal)
            {
                goal=p;
            }
        }
        return goal==0;
        
    }
}

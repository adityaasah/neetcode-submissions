class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int f=0;
        while(f<nums.length)
        {
        for(int i=f+1;i<nums.length;i++)
        {
            if(nums[f]==nums[i] && Math.abs(f-i)<=k)
            {
                return true;
            }
        
        }
        f++;
        }
        return false;
        
    }
}
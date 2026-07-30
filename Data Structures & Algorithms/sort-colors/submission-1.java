class Solution {
    public void sortColors(int[] nums) 
    {
        int l=0;
        int r=nums.length-1;
        int p=0;
        while(p<=r)
        {
            if(nums[p]==0)
            {
                int t=nums[p];
                nums[p]=nums[l];
                nums[l]=t;
                l++;
                p++;
            }
            else if(nums[p]==2)
            {
                int t=nums[p];
                nums[p]=nums[r];
                nums[r]=t;
                r--;
            }
            else
            {
                p++;
            }
        }

        
    }
}
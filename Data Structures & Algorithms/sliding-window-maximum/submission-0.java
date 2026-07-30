class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        if (nums == null || k <= 0) {
            return new int[0];
        }
        ArrayList <Integer> list =new ArrayList<>();
        int l=0;
       
       while (l + k <= nums.length) {
        {
            int max=nums[l];
            
            for(int i=l+1;i<l+k;i++)
            {
                
                if(nums[i]>max)
                {
                    max=nums[i];
                }
            }
            list.add(max);
            l++;
          
        }
       
        
    }
    return list.stream().mapToInt(i -> i).toArray();
}
}


class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums)
        {
        if(counts.containsKey(num))
        {
            return num;
        }
        else
        {
            counts.put(num,1);
        }
        }
        return -1;
        
    }
}

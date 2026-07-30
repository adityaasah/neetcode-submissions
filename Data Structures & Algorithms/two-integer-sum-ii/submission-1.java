class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int sum[]=new int[2];
        int l=0;
        int r=numbers.length-1;
        while(l<r)
        {
            if(numbers[l]+numbers[r]==target)
            {
                sum[0]=l+1;
                sum[1]=r+1;
                break;
            }
            else
            {
                if(numbers[r]+numbers[l]>=target)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return sum;
        
    }
}

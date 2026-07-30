class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int p=m;
        for(int i=0;i<n;i++)
        {
            nums1[p]=nums2[i];
            p++;
        }
        Arrays.sort(nums1);
        
    }
}
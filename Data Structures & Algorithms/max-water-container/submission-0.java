class Solution {
    public int maxArea(int[] heights) 
    {
        int area =0;
        int l=0;
        int r=heights.length-1;
        while(l<r)
        {
            int len=Math.min(heights[l],heights[r]);
            int wid=r-l;
            area=Math.max(area,(len*wid));
            if(heights[l]<=heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }

        }
        return area;

        
    }
}

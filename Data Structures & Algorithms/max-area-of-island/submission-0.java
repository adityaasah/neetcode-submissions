class Solution {
    public int maxAreaOfIsland(int[][] grid) 
    {
        int count =0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                   int curr= countarea(grid,i,j);
                   count =Math.max(count,curr);
                }
            }
        }
        return count;
        
    }
    private int countarea(int grid[][],int i,int j)
    {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int up = countarea(grid, i - 1, j);
        int down = countarea(grid, i + 1, j);
        int left = countarea(grid, i, j - 1);
        int right = countarea(grid, i, j + 1);
        
        return 1 + up + down + left + right;
    }
}

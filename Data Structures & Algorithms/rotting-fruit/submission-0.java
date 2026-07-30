class Solution {
    public int orangesRotting(int[][] grid) 
    {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
       int freshCount = 0;
       int minutes=0;
        Queue <int [] > queue=new LinkedList <>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    queue.add(new int []{i,j});
                }
                else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        if (freshCount == 0) return 0;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while(!queue.isEmpty() && freshCount>0)
        {
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for (int[] dir : directions) {
                    int nextRow = r + dir[0];
                    int nextCol = c + dir[1];
                    if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols && grid[nextRow][nextCol] == 1) {
                        grid[nextRow][nextCol] = 2; // Make it rotten
                        queue.add(new int[]{nextRow, nextCol});
                        freshCount--;
                    }
                }
            }
            minutes++;
        }
return freshCount == 0 ? minutes : -1;
        }

        
    }


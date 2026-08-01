class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> result=new ArrayList<Integer>();
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=m-1;
        int bottom=n-1;
        int top=0;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
              for (int j= top; j<= bottom; j++) {
                result.add(matrix[j][right]);
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

           
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        
        return result;
    }
}

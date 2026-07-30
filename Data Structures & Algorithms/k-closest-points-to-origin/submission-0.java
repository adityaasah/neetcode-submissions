class Solution {
    public int[][] kClosest(int[][] points, int k) 
    {
      PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
  
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int squaredDist = (x * x) + (y * y);
            

            maxHeap.add(new int[]{squaredDist, x, y});
        
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] currentPoint = maxHeap.poll();
            result[i][0] = currentPoint[1]; 
            result[i][1] = currentPoint[2]; 
        }
        
        return result;
    
        

    }
}

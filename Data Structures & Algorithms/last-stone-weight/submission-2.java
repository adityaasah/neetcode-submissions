class Solution {
    public int lastStoneWeight(int[] stones) 
    {
      PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            maxheap.add(stones[i]);

        }
        while(maxheap.size() >1)
        {
                    int y = maxheap.poll();
                    int x=maxheap.poll();
                    if(x!=y)
                    {
                        maxheap.add(y-x);
                    }
                   
        }
         if (maxheap.size() == 1)
                    {
                        return maxheap.poll();
                    }
        return 0;
    }
}

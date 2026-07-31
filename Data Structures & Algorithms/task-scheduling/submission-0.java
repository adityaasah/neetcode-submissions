class Solution {
    public int leastInterval(char[] tasks, int n) 
    {
       Map<Character, Integer> counts = new HashMap<>();

        for (char task : tasks) {
            counts.put(task, counts.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.addAll(counts.values());

        int time = 0;

        while (!maxHeap.isEmpty()) {

            List<Integer> temp = new ArrayList<>();

            // Process at most n + 1 tasks
            for (int i = 0; i <= n; i++) {

                if (!maxHeap.isEmpty()) {

                    int freq = maxHeap.poll();

                    freq--;

                    if (freq > 0) {
                        temp.add(freq);
                    }

                    time++;
                }
                else {
                    // No task available
                    if (temp.isEmpty()) {
                        break;
                    }

                    time++;
                }
            }

            // Put remaining tasks back
            for (int freq : temp) {
                maxHeap.add(freq);
            }
        }

        return time;
    }
}

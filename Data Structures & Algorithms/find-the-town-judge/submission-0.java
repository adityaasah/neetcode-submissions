class Solution {
    public int findJudge(int n, int[][] trust) 
    {
       if (n == 1 && trust.length == 0) {
            return 1;
        }

        int[] trustScores = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0]; 
            int b = trust[i][1]; 

            trustScores[a]--;
            trustScores[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) {
                return i;
            }
        }

        return -1;

        
    }
}
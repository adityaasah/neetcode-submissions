class Solution {
    public int climbStairs(int n) 
    {
        if(n<=2)
        {
            return n;
        }
        int curr=0;
        int oneb=2;
        int twob=1;
        for(int i=3;i<=n;i++)
        {
            curr=oneb+twob ;

            twob=oneb;
            oneb=curr;
        }
        return curr;
    }
}

class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        int n=0;
        Arrays.sort(people);
        int f=0;
        int l=people.length-1;
        while(f<=l)
        {
            
            if(people[f]+people[l]> limit)
            {
                n++;
                l--;
            }
            else
            {
                n++;
                f++;
                l--;
            }
        }
        return n;

        
    }
}
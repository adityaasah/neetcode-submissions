class Solution {
    public void reverseString(char[] s) 
    {
        int l= s.length;
        int first=0,last=l-1;
        while(first<last)
       {
        {
           
           char t=s[first];
            s[first]=s[last];
            s[last]=t;
            first++;
            last--;

        }
       }
       

        
    }
}
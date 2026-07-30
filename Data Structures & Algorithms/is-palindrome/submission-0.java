class Solution {
    public boolean isPalindrome(String s) 
    {
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l=s.length();
        int first=0,last=l-1;
        while(first<last)
        {
           if (s.charAt(first) != s.charAt(last))
            {
                return false;
                
            }
            first++;
            last --;
        }
        return true;
        
    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        int len=Math.max(word1.length(),word2.length());
        String result ="";
        int one=0;
        int two=0;
        for(int i=0;i<len;i++)
        {
            if(one<word1.length())
            {
                result+=word1.charAt(one);
                one++;
            }
             if(two<word2.length())
            {
                result+=word2.charAt(two);
                two++;
            }
        }
        return result;
        
    }
}
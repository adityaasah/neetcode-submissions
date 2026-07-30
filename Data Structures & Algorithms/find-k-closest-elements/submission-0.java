class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        int l=0;
        int r=arr.length-1;
        while(r-l >=k)
        {
           if (Math.abs(arr[l] - x) > Math.abs(arr[r] - x)) {
    l++;
} else {
    r--;
}
        }
        int a[]=new int [k];
        ArrayList <Integer> list=new ArrayList<>();
       for(int i=0;i<k;i++)
       {
           list.add(arr[l]);
            l++;
       }
       return list;
    }
}
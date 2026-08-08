class Solution {
    public int peakIndexInMountainArray(int[] n) {
        int i = 0 ;
        int j = n.length-2 ;
        while(i < j ){
            int m = i + (j-i)/2 ;
            if(n[m] < n[m+1]) i = m+1 ;
            else j = m ;
        }
        return i ;
    }
}
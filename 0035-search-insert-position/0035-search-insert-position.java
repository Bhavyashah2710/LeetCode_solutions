class Solution {
    public int searchInsert(int[] n, int t) {
        int i = 0 ;
        int j = n.length-1 ;
        while(i<=j){
            int m = i + (j-i)/2 ;
            if(n[m] == t) return m ;
            else if (n[m] > t) j = m-1 ;
            else i = m+1 ;
        }
        return i ;
    }
}
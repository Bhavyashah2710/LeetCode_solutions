class Solution {
    public int findPeakElement(int[] n) {
        int b = n.length ;
        if(b == 1) return 0 ;
        if(n[0] > n[1]) return 0 ;
        if(n[b-1] > n[b-2]) return b-1 ;
        int i = 1 ;
        int j = b-2 ;
        while(i <= j){
            int m = i + (j-i)/2 ;
            if(n[m] > n[m-1] && n[m] > n[m+1]) return m ;
            else if(n[m] > n[m-1]) i = m+1 ;
            else j = m-1 ;
        }
        return -1 ;
    }
}
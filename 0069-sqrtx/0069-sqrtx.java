class Solution {
    public int mySqrt(int x) {
        int i = 0 ; 
        int j = x ;
        while(i <= j){
            int m = i + (j-i)/2 ;
            long b = (long)m*m ;
            if(b == x) return m;
            else if(b > x)         j = m-1 ;
            else i = m+1 ;
        }
        return j ; 
    }
}
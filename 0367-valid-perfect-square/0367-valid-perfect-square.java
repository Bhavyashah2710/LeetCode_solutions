class Solution {
    public boolean isPerfectSquare(int n) {
        if(n < 2) return true ;
        long i = 1 ; 
        long j = n ;
        while( i <= j){
            long m = i + (j-i)/2 ;
            if(m*m == n) return true ;
            else if(m*m < n) i = m+1 ;
            else j = m-1 ;
        }
        return false ;
    }
}
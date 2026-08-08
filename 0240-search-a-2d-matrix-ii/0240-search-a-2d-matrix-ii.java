class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        if(m == null || m.length < 1 || m[0].length < 1) return false ;
        int ro = 0 ;
        int co = m[0].length - 1 ;
        while(co >= 0 && ro <= m.length - 1){
            if(t == m[ro][co]) return true ;
            else if( t < m[ro][co]) co-- ;
            else if( t > m[ro][co]) ro++ ;
        } 
        return false ;
    }
}
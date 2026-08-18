class Solution {
    public int sumOfSquares(int[] m) {
        int n = m.length ;
        int v = 0 ;
        for(int i = 1 ; i <= n ; i++){
            if(n%i==0) v += m[i-1]*m[i-1] ;
        }
        return v ;      
    }
}
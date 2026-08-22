class Solution {
    public int maxOperations(int[] num, int k) {
        int i = 0 ;
        int j = num.length - 1 ;
        int v = 0 ;
        Arrays.sort(num) ;
        while(i<j){
            int m = num[i] + num[j] ;
            if(m == k){
                v++ ;
                i++ ;
                j-- ;
            }
            else if( m > k ) j-- ;
            else i++ ; 
        }
        return v ;
    }
}
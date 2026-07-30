class Solution {
    public int minimumPushes(String b) {
        int n = b.length();
        // int v = 0 ;
        // for(int i = 0 ; i < n ; i++) v += i/8 + 1 ;
        // return v ;  
        int v = n/8 ;
        int m = n%8 ;
        return  (4*v*(v+1)) + m*(v+1);    
    }
}
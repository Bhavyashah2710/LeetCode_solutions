class Solution {
    public static int fun(int v){
            int b = 1 ;
            while(v > 0){
                b *= (v % 10) ;
                v /= 10 ;
            }
            return b ;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            int b = fun(n) ;
            if(b % t == 0) return n ;
            n++ ;
        }
    }
}
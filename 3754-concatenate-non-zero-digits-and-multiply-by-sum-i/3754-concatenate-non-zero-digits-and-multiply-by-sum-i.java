class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0 ;
        long x = 0 , s = 0 , p = 1;
        while(n>0){
            if(n%10 != 0) {
                x =  x + n%10*p ;
                s += n%10;
                p*=10;
            }
            n/=10;
        }
        return x*s;
    }
}

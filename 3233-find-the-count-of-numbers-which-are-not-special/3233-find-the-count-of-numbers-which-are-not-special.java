class Solution {
    public int nonSpecialCount(int l, int r) {
        int count = 0 ;
        for(int i = (int)Math.ceil(Math.sqrt(l)) ; i <= (int)Math.sqrt(r) ; i++){
            if(fun(i)) count++;
        }
        return r-l+1-count;
    }
    public static boolean fun(int n){
        if(n<=1) return false;
        for(int j = 2 ; j*j <= n ; j++){
            if(n%j==0) return false;
        }
        return true;
    }
}
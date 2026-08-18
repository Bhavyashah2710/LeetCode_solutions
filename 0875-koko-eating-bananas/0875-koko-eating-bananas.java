class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int i = 1 ;
        int j = 0;
        int v = 1 ;
        for(int n : p){
            j = Math.max(j,n);
        }
        while(i<=j){
            int m = i + (j-i)/2 ;
            if(fun(p,h,m)){
                v = m ;
                j = m-1 ;
            }
            else i = m+1 ;
        }
        return v ;        
    }
    public boolean fun(int[] p , int h , int m){
        long count = 0 ;
        for(int n : p){
            count += n/m ;
            if(n%m != 0) count++;
        }
        return count <= h;
    }
}
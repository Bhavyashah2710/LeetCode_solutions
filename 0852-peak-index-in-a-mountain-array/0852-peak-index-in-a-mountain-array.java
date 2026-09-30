class Solution {
    public int peakIndexInMountainArray(int[] n) {
        int i = 0 ;
        int j = n.length-2 ;
        return fun(n,i,j);
    }
    public static int fun(int[] n, int i , int j){
        if(i>=j) return i ;
        int m = i + (j-i)/2 ;
        if(n[m]<n[m+1]) return fun(n,m+1,j);
        else return fun(n,i,m);
    }
}
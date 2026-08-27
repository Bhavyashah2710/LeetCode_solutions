class Solution {
    public int minSubArrayLen(int t, int[] num) {
        int i = 0 ;
        int j = 0 ;
        int b = 0 ;
        int v = Integer.MAX_VALUE;  
        int n = num.length ;
        while(j < n){
            b += num[j];
            while(b >= t ) {
                v = Math.min(v,j-i+1);
                b -= num[i];
                i++;
            }
            j++;
        }
        return v == Integer.MAX_VALUE ? 0 : v;         
    }
}
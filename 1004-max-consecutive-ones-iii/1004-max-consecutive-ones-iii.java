class Solution {
    public int longestOnes(int[] num, int k) {
        int l = 0 ;
        int v = 0 ;
        int b = 0 ;
        int n = num.length ;
        for(int r = 0 ; r < n ; r++){
            if(num[r] == 0) b++;
            while(b > k){
                if(num[l]==0) b-- ;
            l++;
        }    
        v =  Math.max(v,r-l+1);    
    }
        return v ;
    }
}
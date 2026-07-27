class Solution {
    public int maxProduct(int[] n) {
        int v = 1 ;
        int b = 1 ;
        for(int m : n){
            if(m > v) {
                b = v ;
                v = m ;
            }
            else if( m > b) b = m ;
        }
        return (v-1)*(b-1);
    }
}
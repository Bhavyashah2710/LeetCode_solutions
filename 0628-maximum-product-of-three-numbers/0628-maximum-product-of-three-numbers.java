class Solution {
    public int maximumProduct(int[] b) {
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        int l3 = Integer.MIN_VALUE;
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        for(int v : b){
            if(v >= l1){
                l3 = l2 ;
                l2 = l1 ;
                l1 = v ;
            }
            else if(v >= l2){
                l3 = l2 ;
                l2 = v ;
            }
            else if(v > l3){
                l3 = v;
            }
            if(v <= m1){
                m2 = m1 ;
                m1 = v ;
            }
            else if(v < m2){
                m2 = v ;
            }
        }
        return Math.max(
            l1 * l2 * l3 ,
            l1 * m1 * m2 
        );
    }
}
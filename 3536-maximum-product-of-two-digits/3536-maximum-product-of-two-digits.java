class Solution {
    public int maxProduct(int n){ 
        int b = 0 ;
        int v = 0 ;
        while(n != 0){
            int m = n%10;
            if(m >= b){
                v = b;
                b = m;
            }
            else if(m > v) v = m;
            n /= 10 ;
        }
        return b * v ;
    }
}
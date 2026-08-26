class Solution {
    public int missingMultiple(int[] n, int k) {
       Set<Integer> b = new HashSet<Integer>();
       for(int m : n ) b.add(m) ;
       int mi = k ;
       int i = 1 ;
       while(b.contains(k*i)){
           mi = k*i ;
           i++ ;
       }
       return k*i ;    
    }
}
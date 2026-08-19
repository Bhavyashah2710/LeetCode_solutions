class Solution {
    public int[] twoSum(int[] m, int t) {
        int n = m.length ;
        Map<Integer,Integer> b = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < n ; i++ ) b.put(m[i],i);
        for(int i = 0 ; i < n ; i++ ){
            int v = t - m[i] ;
            if(b.containsKey(v) && i != b.get(v)){
                return new int[] {i , b.get(v) } ;
            }
        }
        return new int[] {-1 , -1} ;
    }
}
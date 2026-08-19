class Solution {
    public int findPairs(int[] b, int m) {
        Map<Integer,Integer> map = new HashMap() ;
        int i = 0 ;
        for(int n : b){
            map.put(n, map.getOrDefault(n, 0) + 1); ;
            i++ ;
        }
        int v = 0 ;
        int j = 0 ;
        for(int n : map.keySet() ){
            if(m > 0 && map.containsKey(n + m) || m == 0 && map.get(n) > 1)
                v++;
            j++ ;
        }
        return v ; 
    }
}
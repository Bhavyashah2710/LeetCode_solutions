class Solution {
    public int countGoodSubstrings(String l) {
        char b[] = l.toCharArray() ;
        int v = 0 ;
        for(int i = 0 ; i <= l.length()-3 ; i++){
            if(b[i] != b[i+1] && b[i] != b[i+2] && b[i+1] != b[i+2]) v++;
        }
        return v ;
    }
}
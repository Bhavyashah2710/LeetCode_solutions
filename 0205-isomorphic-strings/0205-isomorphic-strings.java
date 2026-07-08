class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m[] = new int[512];
        for(int i = 0 ; i < s.length() ; i++){
            int b = s.charAt(i);
            int v = t.charAt(i)+256;
            if(m[b] != m[v]) return false;
            m[b]=i+1;
            m[v]=i+1;
        }
        return true;
    }
}
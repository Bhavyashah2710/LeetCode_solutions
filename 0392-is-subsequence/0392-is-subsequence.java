class Solution {
    public boolean isSubsequence(String m, String n) {
        int b = 0;
        int v = 0;
        while(b<m.length() && v<n.length()){
            if(m.charAt(b) == n.charAt(v)) b++;
            v++;
        }
        return b==m.length();
    }
}
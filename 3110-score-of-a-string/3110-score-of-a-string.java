class Solution {
    public int scoreOfString(String s) {
        int v = s.length();
        int bv = 0;
        for(int i=1;i<v;i++)
        {
            bv+= Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return bv;
    }
}
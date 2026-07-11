class Solution {
    public String gcdOfStrings(String s, String t) {
        if(!(s+t).equals(t+s)) return "";
        int gcd = gcd(s.length(),t.length());
        return s.substring(0,gcd);        
    }
    public int gcd(int a , int b){
         return b == 0 ? a : gcd(b, a % b);
    }
}
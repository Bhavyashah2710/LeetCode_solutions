class Solution {
    public int maxVowels(String s, int k) {
        int b = 0 ;
        int v = 0 ;
        int l = 0 ;
        for(int r = 0 ; r < s.length() ; r++){
            if(check(s.charAt(r))) b++;
            if((r-l+1) == k){
                v = Math.max(v,b);
                if(check(s.charAt(l))) b--;
                l++;
            }
        }
        return v;        
    }
    public boolean check(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
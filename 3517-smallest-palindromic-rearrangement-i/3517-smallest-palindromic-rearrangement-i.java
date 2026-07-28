class Solution {
    public String smallestPalindrome(String s) {
        int f[] = new int[26] ;
        for(char c : s.toCharArray()) f[c-'a']++;
        int n = s.length();
        char[] v = new char[n];
        int l = 0 , r = n-1 ;
        for(int i = 0 ; i < 26 ; i++){
            while(f[i] >= 2){
                v[l++] = (char) ('a'+i);
                v[r--] = (char) ('a'+i);
                f[i] -= 2;
            }
            if(f[i]==1) v[n/2] = (char) ('a'+i);
        }
        return new String(v);        
    }
}
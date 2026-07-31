class Solution {
    public int minimumPushes(String m) {
        int f[] = new int[26];
        for(char b : m.toCharArray()) f[b-'a']++;
        Arrays.sort(f);
        int v = 0 ;
        for(int i = 25 ; i >= 0 && f[i] > 0 ; i--) v += f[i] * ((25-i)/8 + 1);
        return v ;        
    }
}
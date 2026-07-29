class Solution {
    public String smallestPalindrome(String s) {
        int f[] = new int[26];
        for (char c : s.toCharArray())     f[c - 'a']++;
        int n = s.length();
        char[] v = new char[n];
        int l = 0;
        int r = n - 1;
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            while (f[i] >= 2) {
                v[l++] = ch;
                v[r--] = ch;
                f[i] -= 2;
            }
            if (f[i] == 1) {
                v[n / 2] = ch;
            }
        }
        return new String(v);
    }
}

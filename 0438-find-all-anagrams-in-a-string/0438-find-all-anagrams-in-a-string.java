class Solution {
    public List<Integer> findAnagrams(String l, String p) {
        List<Integer> v = new ArrayList<>();
        int n = p.length();
        int m = l.length();
        if (n > m)    return v;
        int[] f = new int[26];
        for (char ch : p.toCharArray())  f[ch - 'a']++;
        for (int i = 0; i < m ; i++) {
            f[l.charAt(i) - 'a']--;
            if (i >= n)   f[l.charAt(i - n) - 'a']++;
            if (i >= n - 1 && fun(f))    v.add(i - n + 1);
        }
        return v;
    }
    private boolean fun(int[] f) {
        for (int l : f) {
            if (l != 0)  return false;
        }
        return true;
    }
}
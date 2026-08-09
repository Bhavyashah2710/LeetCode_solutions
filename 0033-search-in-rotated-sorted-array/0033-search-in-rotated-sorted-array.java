class Solution {
    public int search(int[] n, int t) {
        int i = 0;
        int j = n.length - 1;
        while(i <= j) {
            int m = i + (j - i) / 2;
            if(n[m] == t) return m;
            if(n[m] >= n[i]) {
                if(t >= n[i] && t < n[m])          j = m - 1;
                else         i = m + 1;
            }
            else {
                if(t > n[m] && t <= n[j])     i = m + 1;
                else       j = m - 1;
            }
        }
        return -1;
    }
}
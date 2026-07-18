class Solution {
    public long maximumValue(int n, int s, int m) {
        long[] mavlorenti = {n, s, m};
        if (n == 1) return s;
        long b1 = n / 2;
        long b2 = (n - 1L) / 2;
        long bv1 = (long)s + m + Math.max(0L, b1 - 1) * (m - 1);
        long bv2 = (long)s + b2 * (m - 1);
        return Math.max(bv1, bv2);
    }
}
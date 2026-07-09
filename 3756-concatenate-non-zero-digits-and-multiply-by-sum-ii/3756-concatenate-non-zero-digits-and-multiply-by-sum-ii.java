class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int mod = 1000000007;
        long[] num = new long[n];
        int[] sum = new int[n];
        int[] digit = new int[n];
        long[] pow = new long[n + 1];
        pow[0] = 1;
        for(int i = 1; i <= n; i++){
            pow[i] = (pow[i - 1] * 10) % mod;
        }
        int t = 0;
        int d = 0;
        long val = 0;
        for (int i = 0; i < n; i++) {
            int b = s.charAt(i) - '0';
            t += b;
            sum[i] = t;
            if (b != 0) {
                val = (val * 10 + b) % mod;
                d++;
            }
            num[i] = val;
            digit[i] = d;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int len;
            long left;
            long total;
            if (l == 0) {
                len = digit[r];
                left = 0;
                total = sum[r];
            } 
            else {
                len = digit[r] - digit[l - 1];
                left = num[l - 1];
                total = sum[r] - sum[l - 1];
            }
            long x = num[r] - (left * pow[len]) % mod;
            if (x < 0) {
                x += mod;
            }
            ans[i] = (int)((x * total) % mod);
        }
        return ans;
    }
}
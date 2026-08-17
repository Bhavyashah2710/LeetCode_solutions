import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] b, int[] v) {
        int n = b.length;
        int m = v.length;
        int[] p = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++)    p[k++] = b[i];
        for (int i = 0; i < m; i++)    p[k++] = v[i];
        Arrays.sort(p);
        int total = p.length;
        if (total % 2 == 1)     return (double) p[total / 2];
        else {
            int middle1 = p[total / 2 - 1];
            int middle2 = p[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}
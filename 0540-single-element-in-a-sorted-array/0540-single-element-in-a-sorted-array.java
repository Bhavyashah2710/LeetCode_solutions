class Solution {
    public int singleNonDuplicate(int[] n) {
        int b = n.length;
        int i = 0;
        int j = b - 1;
        if (b == 1)    return n[0];
        while (i <= j) {
            int m = i + (j - i) / 2;
            if (m == 0 && n[m] != n[m + 1])             return n[m];
            if (m == b - 1 && n[m] != n[m - 1])         return n[m];
            if (m > 0 && m < b - 1 &&
                n[m - 1] != n[m] && n[m] != n[m + 1])   return n[m];
            if (m % 2 == 0) {
                if (n[m] == n[m + 1])    i = m + 2;
                else     j = m - 1;
            } 
            else {
                if (n[m - 1] == n[m])             i = m + 1;
                else      j = m - 1;
            }
        }
        return -1;
    }
}
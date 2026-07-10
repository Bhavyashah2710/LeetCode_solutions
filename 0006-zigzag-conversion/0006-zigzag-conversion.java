class Solution {
    public String convert(String s, int n) {
        if (n == 1) return s;
        StringBuilder[] b = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            b[i] = new StringBuilder();
        }
        int row = 0;
        boolean down = false;
        for (char ch : s.toCharArray()) {
            b[row].append(ch);
            if (row == 0 || row == n-1) {
                down = !down;
            }
            if (down) {
                row++;
            } else {
                row--;
            }
        }
        StringBuilder v = new StringBuilder();

        for (StringBuilder sb : b) {
            v.append(sb);
        }
        return v.toString();
    }
}
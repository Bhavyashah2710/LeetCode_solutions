class Solution {
    public boolean isLongPressedName(String n, String t) {
        int j = 0;        
        for (int i = 0; i < t.length(); i++) {
            if (j < n.length() && t.charAt(i) == n.charAt(j)) {
                j++;
            } else if (i == 0 || t.charAt(i) != t.charAt(i - 1)) {
                return false;
            }
        }
        return j == n.length();
    }
}
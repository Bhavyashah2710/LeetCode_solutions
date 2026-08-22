class Solution {
    public int minimumLength(String b) {
        int i = 0 ;
        int j = b.length() - 1;
        while (i < j && b.charAt(i) == b.charAt(j)) {
            char ch = b.charAt(i);
            while (i <= j && b.charAt(i) == ch) i++;
            while (i <= j && b.charAt(j) == ch) j--;
        }
        return j - i + 1;
    }
}
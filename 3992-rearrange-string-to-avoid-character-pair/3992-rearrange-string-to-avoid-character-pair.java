class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder bv = new StringBuilder();
        for (char b : s.toCharArray()) {
            if (b == y)
                bv.append(b);
        }
        for (char b : s.toCharArray()) {
            if (b != x && b != y)
                bv.append(b);
        }
        for (char b : s.toCharArray()) {
            if (b == x)
                bv.append(b);
        }
        return bv.toString();
    }
}
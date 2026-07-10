class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder b = new StringBuilder();
        int v = k;        
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '-') {
                continue;
            }            
            if (v == 0) {
                b.append("-");
                v = k;
            }            
            b.append(Character.toUpperCase(ch));
            v--;
        }        
        return b.reverse().toString();
    }
}

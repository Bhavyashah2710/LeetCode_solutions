class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;
        boolean l = false;
        boolean u = false;
        boolean d = false;
        boolean s = false;
        String sp = "!@#$%^&*()-+";
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch))
                l = true;
            else if (Character.isUpperCase(ch))
                u = true;
            else if (Character.isDigit(ch))
                d = true;
            else if (sp.indexOf(ch) != -1)
                s = true;
            if (i > 0 && password.charAt(i) == password.charAt(i - 1))
                return false;
        }
        return l && u && d && s;
    }
}
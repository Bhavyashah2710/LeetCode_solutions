class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8 ) return false;
        if(!password.matches(".*[A-Z].*")) return false;
        if(!password.matches(".*[a-z].*")) return false;
        if(!password.matches(".*[^A-Za-z0-9].*")) return false;
        if (!password.matches(".*[0-9].*")) return false;
        for(int i = 1 ; i < password.length() ; i++ ){
            if(password.charAt(i)==password.charAt(i-1)) return false;
        }
        return true;
    }
}
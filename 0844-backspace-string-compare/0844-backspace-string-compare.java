class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder b = new StringBuilder();
        StringBuilder v = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='#'){
                if(b.length()>0) b.deleteCharAt(b.length() - 1);
                else continue;
            }
            else  b.append(s.charAt(i));
        }
        for(int i = 0 ; i < t.length() ; i++){
            if(t.charAt(i)=='#'){
                if(v.length()>0) v.deleteCharAt(v.length() - 1);
                else continue;
            }
            else  v.append(t.charAt(i));
        }        
        return b.toString().equals(v.toString());
    }
}
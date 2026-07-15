class Solution {
    public static boolean fun(String b , String v){
        for(int i = 0 ; i < v.length() ; i++){
            if(b.indexOf(b.charAt(i)) != v.indexOf(v.charAt(i))) return false;
        }
        return true;
    } 
    public List<String> findAndReplacePattern(String[] words, String p) {
        ArrayList<String> bv = new ArrayList<>();
        for(String j : words){
            if(fun(j,p)) bv.add(j);
        }
        return bv; 
    }
}
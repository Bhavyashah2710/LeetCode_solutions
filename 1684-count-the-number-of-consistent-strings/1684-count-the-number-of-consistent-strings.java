class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int count = 0 ; 
        for(String s : words){
            boolean ok = true;
            for(int i = 0;i<s.length() ;i++){
                if(allowed.indexOf(s.charAt(i))==-1){
                ok=false;
                break;
                }
            }
            if(ok) count++;
        } 
        return count;
    }
}
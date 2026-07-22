class Solution {
    public boolean isCircularSentence(String sentence) {
        char [] b = sentence.toCharArray();
        for(int i=0;i<b.length;i++){
            if(b[i]==' ') if(b[i-1]!=b[i+1]) return false;
        }
        return b[0]==b[b.length-1];
    }
}

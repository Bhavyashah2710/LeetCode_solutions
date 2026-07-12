class Solution {
    public String reverseVowels(String s) {
        char[] b = s.toCharArray();
        String v = "aeiouAEIOU";
        int i = 0 ;
        int j = s.length()-1;
        while(i < j ){
            while(i < j && v.indexOf(b[i])==-1) i++;
            while(i < j && v.indexOf(b[j])==-1) j--;
            char m = b[i];
            b[i] = b[j] ;
            b[j] = m ;
            i++;
            j--;
        }
        return String.valueOf(b);
    }
}
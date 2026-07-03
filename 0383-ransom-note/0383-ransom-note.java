class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
        int[] a1 = new int[26];
        for (char c : magazine.toCharArray())   a1[c-'a']++;
        for (char c : ransomNote.toCharArray()){
            if (a1[c-'a'] == 0) return false;
            a1[c-'a']--;
        }
        return true;
    }
}
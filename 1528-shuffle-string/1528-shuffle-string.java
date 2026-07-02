class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        int i = 0;
        for(char c : s.toCharArray()){
            arr[indices[i]] = c;
            i++;
        }
        return new String(arr);
    }
}
class Solution {
    String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i].length() == 0) continue; // skip empty words

            if (ans.length() > 0) {
                ans.append(" ");
            }

            ans.append(arr[i]);
        }

        return ans.toString();
    }
}
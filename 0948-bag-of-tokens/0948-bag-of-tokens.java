import java.util.Arrays;
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);        
        int i = 0;
        int j = tokens.length - 1;
        int current = 0;
        int maxcurrent = 0;
        
        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i];
                current++;
                i++;
                maxcurrent = Math.max(maxcurrent, current);
            } 
            else if (current > 0 && i < j) {
                power += tokens[j];
                current--;
                j--;
            } 
            else {
                break;
            }
        }
        
        return maxcurrent;
    }
}
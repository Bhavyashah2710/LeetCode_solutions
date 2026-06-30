import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }        
        int j = 0;
        for (int n : set) {
            nums[j] = n;
            j++;
        }
         return set.size();
    }
}
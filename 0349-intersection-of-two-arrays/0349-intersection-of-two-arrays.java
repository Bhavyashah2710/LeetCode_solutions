import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        Set<Integer> b = new HashSet<>();        
        for (int num : nums1) {
            st.add(num);
        }        
        for (int num : nums2) {
            if (st.contains(num)) {
                b.add(num);
            }
        }
        int ans[] = new int[b.size()];
        int i = 0;
        for (int num : b) {
            ans[i++] = num;
        }        
        return ans;
    }
}
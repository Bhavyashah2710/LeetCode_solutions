class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> b = new HashSet<>();
        HashSet<Integer> v = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                b.add(nums[i] ^ nums[j]);
            }
        }
        for (int x : b) {
            for (int y : nums) {
                v.add(x ^ y);
            }
        }
        return v.size();
    }
}
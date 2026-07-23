class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int b = nums.length;
        if(b<=2) return b;
        int  v = 1;
        while(v <= b) v*=2;
        return v;
    }
}
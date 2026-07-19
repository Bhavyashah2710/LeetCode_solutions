class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
         int bv = nums[0];
         int vb = nums[0];
        for(int n : nums){
            bv = Math.max(bv,n);
            vb = Math.min(vb,n);
        }
        return gcd(bv,vb);
    }
}
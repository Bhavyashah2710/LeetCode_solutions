class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int preSum = 0;        
        int[] remainderCounts = new int[k];
        remainderCounts[0] = 1;
        for (int num : nums) {
            preSum += num;
            int remainder = preSum % k;            
            if (remainder < 0)   remainder += k;            
            count += remainderCounts[remainder];
            remainderCounts[remainder]++;
        }        
        return count;
    }
}
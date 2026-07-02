class Solution {
    public int minimumSwaps(int[] nums) {
   int b=0;
    for(int i=0; i<nums.length;i++){
        if(nums[i]==0)       continue;
        else      b++;
    }
    int v=0;
        for(int i=0;i<b;i++){
            if(nums[i]==0){
                v++;
            }
        }
        return v;
}
}

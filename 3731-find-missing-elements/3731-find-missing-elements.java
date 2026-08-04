class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> v = new ArrayList<>();
        Set<Integer> b = new HashSet<>();
        for(int n : nums ) b.add(n) ;
        if(nums.length==0) return v ;
        int l = nums[0] ;
        int h = nums[0] ;
        for(int n : b ){
            if(n > h) h = n ;
            if(n < l) l = n ;
        }
        for(int i = l ;  i <= h ; i++) {
            if(!b.contains(i)) v.add(i);
        }
        return v;
    }
}
class Solution {
    public List<Integer> findMissingElements(int[] nums) {      
        ArrayList<Integer> v = new ArrayList<>();
        if(nums.length==0) return v ; 
        Set<Integer> b = new HashSet<>();
        int l = nums[0] ;
        int h = nums[0] ;
        for(int n : nums ){
            if(n > h) h = n ;
            if(n < l) l = n ;
            b.add(n) ;
        }
        for(int i = l ;  i <= h ; i++) {
            if(!b.contains(i)) v.add(i);
        }
        return v;
    }
}
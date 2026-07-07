class Solution {
    public String largestNumber(int[] nums) {
        String [] b = new String[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            b[i] = String.valueOf(nums[i]); 
        }
        Arrays.sort(b,(p,q)-> (q+p).compareTo(p+q));
        if(b[0].equals("0")) return "0";
         StringBuilder v= new StringBuilder();
        for(String s : b) v.append(s);
        return v.toString();
    }
}
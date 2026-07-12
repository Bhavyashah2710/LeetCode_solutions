class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        List<Boolean> b = new ArrayList<>();
        int m = 1 ;
        for(int n : candies){
            if (n > m ) m=n;
        }
        for(int n : candies){
            if (n+e >= m ) b.add(true) ;
            else b.add(false);
        }
        return b;
    }
}
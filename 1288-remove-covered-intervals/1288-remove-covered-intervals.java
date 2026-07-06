class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) ->{
            if(a[0]==b[0]) return b[1] - a[1];
            return a[0]-b[0]; });
        int count = intervals.length;
        int currl = intervals[0][0];
        int currr = intervals[0][1];
        for(int b[] : intervals){
            if(b[0]>=currl && b[1]<=currr)      count--;
            else {                
                 currl = b[0];
                 currr = b[1];
            }
        }
        return count+1;
    }
}
class Solution {
    public double angleClock(int hour, int minutes) {
        double min = minutes*6;
        double hourhand = (hour%12)*30+(minutes*0.5);
        double diff = Math.abs(hourhand - min);
        return Math.min(diff,360.0-diff); 
        
    }
}
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for( int h=0; h<hours.length ;  h++){
            if(hours[h] >= target) count++;
        }
        return count;
    }
}
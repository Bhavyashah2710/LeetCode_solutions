class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;        
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
                int fiLand = landStartTime[i] + landDuration[i];
                int statWater = Math.max(fiLand, waterStartTime[j]);
                int LWTime1 = statWater + waterDuration[j];
                int fiWater = waterStartTime[j] + waterDuration[j];
                int statLand = Math.max(fiWater, landStartTime[i]);
                int WLTime2 = statLand + landDuration[i];
                ans = Math.min(ans, Math.min(LWTime1, WLTime2));
            }
        }
        return ans;
    }
}
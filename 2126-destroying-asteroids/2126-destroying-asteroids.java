import java.util.*;
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long cmass=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++){
            if(cmass>=asteroids[i]) cmass+=asteroids[i];
            else return false;
        }
        return true;
    }
}
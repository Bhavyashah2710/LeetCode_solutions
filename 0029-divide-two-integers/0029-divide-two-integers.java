import java.util.*;
class Solution {
    public int divide(int dividend, int divisor) {
        int quo = dividend / divisor;
        if(dividend== -2147483648 && divisor==-1){
            quo = 2147483647;
        }
        return quo;
    }
}
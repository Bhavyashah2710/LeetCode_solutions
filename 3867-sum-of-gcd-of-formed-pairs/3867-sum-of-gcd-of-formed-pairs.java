import java.util.*;
class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] pgcd = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max)   max = nums[i];
            pgcd[i] = gcd(nums[i], max);
        }
        Arrays.sort(pgcd);
        long vb = 0;
        int  b = 0;
        int v = n - 1;

        while (b < v) {
            vb += gcd(pgcd[b], pgcd[v]);
            b++;
            v--;
        }
        return vb;
    }
}
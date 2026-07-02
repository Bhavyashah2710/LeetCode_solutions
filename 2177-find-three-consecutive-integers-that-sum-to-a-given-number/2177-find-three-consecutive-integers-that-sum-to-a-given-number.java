class Solution {
    public long[] sumOfThree(long num) {
        long a[]=new long[3];
        long c[]=new long[0];
        if(num%3!=0) return c;
        else {
            long b=num/3;
            a[0]=b-1;
            a[1]=b;
            a[2]=b+1;
        }
        return a;
    }
}
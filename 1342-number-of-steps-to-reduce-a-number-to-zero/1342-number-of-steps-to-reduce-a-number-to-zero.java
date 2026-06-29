class Solution {
    public int numberOfSteps(int n) {
        int s=0;
        while(n!=0){
            if(n%2==0) n/=2;
            else n-=1;
        s++;
        }
        return s;
    }
}
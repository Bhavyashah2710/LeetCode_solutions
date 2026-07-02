class Solution {
    public boolean isPalindrome(int x) {
        int newn=0;
        int on = x;
        while(x>0){
            newn = newn*10+x%10;
            x/=10;
        }
        return newn==on ;
        
    }
}
class Solution {
    public List<Integer> selfDividingNumbers(int l, int r) {
        List<Integer> b = new ArrayList<>();
        for(int i = l ; i <= r ; i++ ) {
            if(check(i)) b.add(i);
        }
        return b;
    }
    static boolean check(int n){
        if(n<=9) return true;
        int on = n ;
        while(n>0){
            int d = n%10;
            if(d==0 || on % d!=0) return false;
            n/=10;
        }
        return true;
    }
}

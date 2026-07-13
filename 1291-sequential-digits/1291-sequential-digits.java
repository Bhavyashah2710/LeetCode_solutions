class Solution {
    public List<Integer> sequentialDigits(int l, int h) {
        ArrayList<Integer> b = new ArrayList<>();

        for(int i = 1 ; i < 9 ; i++){
            int v = i;
            for(int j = i+1 ; j < 10 ; j++){
                v = v*10 + j;
                if(v>h) break;
                if(v>=l && v<=h) b.add(v);
            }           
        }
        Collections.sort(b);
        return b; 
    }
}
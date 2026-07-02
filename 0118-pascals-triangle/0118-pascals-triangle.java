class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int r = 0; r < numRows; r++) {
        List<Integer> row = new ArrayList<>();
        long current = 1; 
        row.add((int) current);        
         for (int i = 0; i < r; i++) {
                current = current * (r - i) / (i + 1);
                row.add((int) current);
            }    
         ans.add(row);
        }        
        return ans;
    }
} 
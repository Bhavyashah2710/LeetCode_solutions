class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;        
        k = k % (m * n);
        while (k-- > 0) {
            int[][] temp = new int[m][n];
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++)   temp[r][c] = grid[r][c];
            }            
            int i = 0;
            int j = 0;
            while (i < m && j < n) {
                if (j < n - 1) {
                    grid[i][j + 1] = temp[i][j];
                    j++;
                } 
                else if (i < m - 1 && j == n - 1) {
                    grid[i + 1][0] = temp[i][j];
                    i++;
                    j = 0;
                }
                else if (i == m - 1 && j == n - 1) {
                    grid[0][0] = temp[i][j];
                    i++;
                }
            }
        }        
        ArrayList<List<Integer>> bv = new ArrayList<>();
        for (int[] v : grid) {
            ArrayList<Integer> vb = new ArrayList<>();
            for (int p : v)    vb.add(p);
            bv.add(vb);
        }        
        return bv;
    }
}

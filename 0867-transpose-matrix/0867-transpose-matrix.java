class Solution {
    public int[][] transpose(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int[][] B = new int[C][R];        
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                B[c][r] = matrix[r][c]; 
            }
        }        
        return B;
    }
}
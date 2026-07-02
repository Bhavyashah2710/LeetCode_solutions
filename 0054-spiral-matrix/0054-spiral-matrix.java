class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> a = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return a;
        int n = matrix.length;
        int m = matrix[0].length;        
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;        
        int i = 0, j = 0;
        int total = n * m;
        while (a.size() < total) {
            a.add(matrix[i][j]);
            if (i == top && j < right)      j++;
            else if (j == right && i < bottom)    i++;
            else if (i == bottom && j > left)     j--;
            else if (j == left && i > top + 1)   i--;
            else {
                top++;
                bottom--;
                left++;
                right--;
                j++;
            }
        }        
        return a;
    }
}
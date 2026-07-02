class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
       ArrayList<Integer> a = new ArrayList<>();
       int r[]= new int[matrix.length];
       int c[]= new int [matrix[0].length];
       for(int i=0; i<matrix.length;i++){
        int min = Integer.MAX_VALUE;
            for (int j = 0; j <matrix[0].length ; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        r[i]=min;
       }
       for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            c[j] = max;
        }
        for (int i = 0; i < matrix.length; i++) {     
            for (int j = 0; j < matrix[0].length; j++) {
                if (r[i] == c[j]) {
                    a.add(r[i]);
                }
            }
        }        
        return a;
    }
}
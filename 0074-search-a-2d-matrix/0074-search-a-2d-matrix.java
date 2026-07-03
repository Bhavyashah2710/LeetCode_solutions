class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for( int[] row : matrix){
            for( int i : row ){
                if(i==target) return true;
            }
        }
        return false;
    }
}
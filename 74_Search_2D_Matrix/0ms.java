class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length, n = matrix[0].length;
    int i = 0;

    while(i <= m) {
      if(target >= matrix[i][0] && target <= matrix[i][n - 1]) {
        
        for(int j = 0; j < n; j++) {
          if(matrix[i][j] == target)
            return true;
        }

        return false;
      }
      i++;
    }

    return false;
  }
}

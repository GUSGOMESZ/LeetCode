class Solution {
  public void rotate(int[][] matrix) {
    for(int i = 0; i < matrix.length; i++) {
      for(int j = i + 1; j < matrix.length; j++) {
        int aux = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = aux;
      }
    }

    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0, k = matrix.length - 1; j < matrix.length / 2; j++, k--) {
        int aux = matrix[i][j];
        matrix[i][j] = matrix[i][k];
        matrix[i][k] = aux;
      }
    }
  }
}

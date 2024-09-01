class Solution {
  public void setZeroes(int[][] matrix) {
    ArrayList<Integer> iArr = new ArrayList<>();
    ArrayList<Integer> jArr = new ArrayList<>();

    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        if(matrix[i][j] == 0) {
          iArr.add(i);
          jArr.add(j);
        }
      }
    }

    int zeros = iArr.size(), columns = matrix[0].length, rows = matrix.length;

    for(int i = 0; i < zeros; i++) {
      int iIndex = iArr.get(i), yIndex = jArr.get(i);

      for(int j = 0; j < rows; j++) {
        matrix[j][yIndex] = 0;
      }

      for(int j = 0; j < columns; j++) {
        matrix[xIndex][j] = 0;
      }
    }
  }
}

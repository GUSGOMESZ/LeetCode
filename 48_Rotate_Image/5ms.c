void rotate(int** matrix, int matrixSize, int* matrixColSize) {
  int aux;

  for(int i = 0; i < matrixSize; i++) {
    for(int j = 0; j < matrixSize; j++) {
      if(i != j) {
        aux = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = aux;
      }
    }
  }

  for(int i = 0; i < matrixSize; i++) {
    for(int j = 0, k = matrixSize - 1; j < matrixSize; j++, k--) {
      aux = matrix[i][j];
      matrix[i][j] = matrix[i][k];
      matrix[i][k] = aux;
    }
  }
}

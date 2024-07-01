void swap(int* a, int* b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}

void reverse(int* arr, int n) {
  int left = 0, right = n - 1;
  while(left < right) {
    swap(&arr[left], &arr[right]);
    left++;
    right--;
  }
}

void rotate(int** matrix, int matrixSize, int* matrixColSize) {
  int n = matrixSize;
  int m = *matrixColSize;
  for(int i = 0; i < n - 1; i++) {
    for(int j = i + 1; j < n; j++) {
      swap(&matrix[i][j], &matrix[j][i]);
    }
  }

  for(int i = 0; i < n; i++) {
    reverse(matrix[i], m);
  }
}

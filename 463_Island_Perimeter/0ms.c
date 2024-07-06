int islandPerimeter(int** grid, int gridSize, int* gridColSize) {
  int i, j;
  int aux_i, aux_j;

  int row_bound = gridSize - 1;
  int column_bound = *gridColSize - 1;
  int surround;
  int perimeter = 0;

  for(i = 0; i < gridSize; i++) {
    aux_i = i;

    for(j = 0; j < *gridColSize; j++) {
      aux_j = j;

      if(grid[aux_i][aux_j] == 1) {
        surround = 0;

        if(aux_i != 0) 
          if(grid[aux_i - 1][aux_j] == 1)
            surround += 1;

        if(aux_j != column_bound)
          if(grid[aux_i][aux_j + 1] == 1)
            surround += 1;

        if(aux_i != row_bound)
          if(grid[aux_i + 1][aux_j] == 1)
            surround += 1;

        if(aux_j != 0)
          if(grid[aux_i][aux_j - 1] == 1)
            surround += 1;

        perimeter = perimeter + (4 - surround);
      }
    }
  }

  return perimeter;
}

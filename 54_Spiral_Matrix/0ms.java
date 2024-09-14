class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> list = new ArrayList<>();

    if(matrix == null || matrix.length == 0) {
      return list;
    }

    int up = 0, down = matrix.length - 1;
    int left = 0, right = matrix[0].length - 1;

    while (up <= down && left <= right) {

      for(int col = left; col <= right; col++) {
        list.add(matrix[up][col]);
      }

      up++;

      for(int row = up; row <= down; row++) {
        list.add(matrix[row][right];
      }

      right--;

      if(up <= down) {
        for(int col = right; col >= left; col--) {
          list.add(matrix[down][col]);
        }

        down--;
      }

      if(left <= right) {
        for(int row = down; row >= up; row--) {
          list.add(matrix[row][left]);
        }

        left++;
      }
    }

    return list;
  }
}

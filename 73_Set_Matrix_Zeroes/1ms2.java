class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rows = matrix.length, columns = matrix[0].length;
        boolean[] rowArr = new boolean[rows];
        boolean[] colArr = new boolean[columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(matrix[i][j] == 0) {
                    rowArr[i] = true;
                    colArr[j] = true;
                }
            }
        }

        for(int i = 0; i < rows; i++) {
            if(rowArr[i]) {
                for(int j = 0; j < columns; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < columns; i++) {
            if(colArr[i]) {
                for(int j = 0; j < rows; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}

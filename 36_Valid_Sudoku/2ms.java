class Solution {
  public boolan isValidSudoku(char[][] board) {
    HashMap<Character, Integer> map = new HashMap<>();

    for(int i = 0; i < 9; i++) {
      for(int j = 0; j < 9; j++) {
        if(board[i][j] != '.') {
          if(!map.containsKey(board[i][j])) {
            map.put(board[i][j], 1);
          } else {
            return false;
          }
        }
      }

      map.clear();
    }

    for(int i = 0; i < 9; i++) {
      for(int j = 0; j < 9; j++) {
        if(board[j][i] != '.') {
          if(!map.containsKey(board[j][i])) {
            map.put(board[j][i], 1);
          } else {
            return false;
          }
        }
      }

      map.clear();
    }

    int startX = 0, startY = 0;

    while(startX < 9 && startY < 9) {
      for(int i = startX; i < startX + 3; i++) {
        for(int j = startY; j < startY + 3; j++) {
          if(board[i][j] != '.') {
            if(map.containsKey(board[i][j])) {
              return false;
            } else {
              map.put(board[i][j], 1);
            }
          }
        }
      }

      startX = 3;

      if(startX >= 9) {
        startY += 3;
        startX = 0;
      }

      map.clear();
    }

    return true;
  }
}

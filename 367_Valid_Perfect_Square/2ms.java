class Solution {
  public boolean isPerfectSquare(int num) {
    if(num == 1)
      return true;
    else {
      boolean stop = false;
      long aux = 2;

      while(!stop) {
        if(aux * aux == num)
          return true;

        if(aux * aux > num)
          stop = true;

        aux++;
      }
    }

    return false;
  }
}

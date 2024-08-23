class Solution {
  public int mySqrt(int x) {
    if(x == 0) return 0;
    if(x == 1 || x == 2 || x == 3) return 1;

    int i;

    for(i = 2; i < x; i++) {
      if(i * i >= x)
        if(i * i == x)
          return i;
        else
          return (i - 1);
    }

    return 46340;
  }
}

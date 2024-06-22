class Solution {
  public boolean isPowerOfTwo(int n) {
    long multi = 1;

    while(multi < n)
      multi *= 2;

    if(multi == n)
      return true;
    else
      return false
  }
}

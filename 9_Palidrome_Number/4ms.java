class Solution {
  public boolean isPalidrome(int x) {
    if(x < 0)
      return false;
    if(x >= 0 && x <=9)
      return true;

    int i = x, revertedNumber = 0, lastDigit;

    while(i > 0) {
      lastDigit = i % 10;
      revertedNumber = (revertedNumber * 10) + lastDigit;
      i = i / 10;
    }

    return (revertedNumber == x);
  }
}

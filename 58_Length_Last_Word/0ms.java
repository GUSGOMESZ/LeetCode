class Solution {
  public int lengthOfLastWord(String s) {
    int length = 0, lastIndex = s.length() - 1;

    while(lastIndex >= 0 && s.charAt(lastIndex) == ' ')
      lastIndex--;

    while(lastIndex >= 0 && s.charAt(lastIndex) != ' ') {
      length++;
      lastIndex--;
    }

    return length;
  }
}

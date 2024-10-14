class Solution {
  public char kthCharacter(int k) {
    String words = "a";

    while(words.length() < k) {
      StringBuilder sb = new StringBuilder();

      for(int i = 0; i < words.length(); i++) {
        if (words.charAt(i) == 'z')
          sb.append('a');
        else
          sb.append((char)(words.charAt(i) + 1));
      }

      words += sb.toString();
    }

    return words.charAt(k - 1);
  }
}

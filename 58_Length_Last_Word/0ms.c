int lengthOfLastWord(char *s) {
  int length = 0;
  int n = strlen(s);
  int lastIndex = n - 1;

  while(lastIndex >= 0 && s[lastIndex] == ' ')
    lastIndex--;

  while(lastIndex >= 0 && s[lastIndex] != ' ') {
    length++;
    lastIndex--;
  }

  return length;
}

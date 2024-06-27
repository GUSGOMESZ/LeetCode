int lengthOfTheLastWord(char *s) {
  char *pS = s;
  int currentWordLength = 0, letterCount;

  for(int i = 0; i < strlen(s); i++) {
    if(*(pS + i) != ' ') {
      letterCount = 0;

      while(*(pS + i) != ' ' && *(pS + i) != '\0') {
        letterCount++;
        i++;
      }

      currentWordLength = letterCount;
    }
  }

  return currentWordLength;
}

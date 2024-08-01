char* reverseWords(char* s) {
  char aux;

  for(int i = 0, j = (strlen(s) - 1); i < strlen(s) / 2; i++, j--) {
    aux = s[j];
    s[j] = s[i];
    s[i] = aux;
  }

  bool foundFirstLetter = false;
  int firstLetterIndex, lastLetterIndex;

  for(int i = 0; i < strlen(s); i++) {

    if(s[i] != ' ' && !foundFirstLetter) {
      firstLetterIndex = i;
      foundFirstLetter = true;
    } else if(foundFirstLetter) {
      if(s[i] == ' ' && i == firstLetterIndex + 1) {
        foundFirstLetter = false;
      } else if(s[i] == ' ' || i == strlen(s) - 1) {
        if(i == strlen(s) - 1)
          lastLetterIndex = i;
        else 
          lastLetterIndex = i - 1;

        for(int j = 0, k = firstLetterIndex, l = lastLetterIndex; j < ((lastLetterIndex - firstLetterIndex + 1) / 2); j++, k++, l--) {
          aux = s[l];
          s[l] = s[k];
          s[k] = aux;
        }

        foundFirstLetter = false;
      }
    }
  }

  int extraSpaces = 0, firstCharIndex, lastCharIndex;

  for(int i = 0; i < strlen(s); i++) {
    if(s[i] == ' ') {
      extraSpaces++;
    } else {
      firstCharIndex = i;
      break;
    }
  }

  for(int i = strlen(s) - 1; i >= 0; i--) {
    if(s[i] == ' ') {
      extraSpaces++;
    } else {
      lastCharIndex = i;
      break;
    }
  }

  bool isSpacing = false;

  for(int i = firstCharIndex; i < lastCharIndex; i++) {
    if(s[i] == ' ') {
      if(isSpacing) {
        extraSpaces++;
      } else {
        isSpacing = true;
      }
    } else {
      isSpacing = false;
    }
  }

  int strLen = (strLen(s) - extraSpaces), j = 0;
  char *str = malloc((strLen + 1) * sizeof(char));
  isSpacing = false;

  for(int i = firstCharIndex; i <= lastCharIndex; i++) {
    if(s[i] == ' ') {
      if(isSpacing) {
        continue;
      } else {
        str[j] = s[i];
        j++;
        isSpacing = true;
      }
    } else {
      str[j] = s[i];
      j++;
      isSpacing = false;
    }
  }

  str[j] = '\0';

  return str;
}

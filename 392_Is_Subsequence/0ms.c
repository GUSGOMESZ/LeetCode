bool isSubsequence(char* s, char* t) {
  int sLen = strlen(s);
  int tLen = strlen(t);

  if(sLen > tLen)
    return false;

  int lettersFound = 0;

  for(int i = 0; i < tLen; i++) {
    if(t[i] == s[lettersFound])
      lettersFound++;
  }

  if(lettersFound == sLen)
    return true;

  return false;
}

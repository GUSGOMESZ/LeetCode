int strStr(char* haystack, char* needle) {
  int i, j, index = -1;

  if (strlen(needle) == 1) {
    for(i = 0; i < strlen(haystack); i++) {
      if(haystack[i] == needle[0]) {
        index = i;
        break;
      }
    }
  } else {
    for(i = 0; i < strlen(haystack); i++) {
      if(haystack[i] == needle[0]) {
        index = i;
        for(j = 1; j < strlen(needle); j++) {
          if(needle[j] == haystack[i + j]) {
            if(j == strlen(needle) - 1)
              return index;
          } else {
            index = -1;
            break;
          }
        }
      }
    }
  }
  return index;
}

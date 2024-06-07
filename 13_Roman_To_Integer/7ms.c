#include <stdio.h>

int romanToInt(char* s) {
  int len = strlen(s), sum = 0, i;

  for(i = 0; i < len; i++) {
    if(*(s + i) == 'I') {
      if(*((s + i) + 1) == 'V' && i != len - 1) {
        sum += 4;
        i++;
      }
      else if(*((s + i) + 1) == 'X' && i != len - 1) {
        sum += 9;
        i++;
      }
      else {
        sum += 1;
      }
    }
    else if(*((s + i) == 'X') {
      if(*((s + i) + 1) == 'L' && i != len - 1) {
        sum += 40;
        i++;
      }
      else if(*((s + i) + 1) == 'C' && i != len - 1) {
        sum += 90;
        i++;
      }
      else {
        sum += 10;
      }
    }
    else if(*(s + i) == 'C') {
      if(*((s + i) + 1) == 'D' && i != len - 1) {
        sum += 400;
        i++;
      }
      else if(*((s + i) + 1) == 'M' && i != len - 1) {
        sum += 900;
        i++;
      }
      else {
        sum += 100;
      }
    }
    else if(*(s + i) == 'V') {
      sum += 5;
    }
    else if(*(s + i) == 'L') {
      sum += 50;
    }
    else if(*(s + i) == 'D') {
      sum += 500;
    }
    else if(*(s + i) == 'M') {
      sum += 1000;
    }
  }

  return sum;
}

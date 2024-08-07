int* twoSum(int* numbers, int numbersSize, int target, int* returnSize) {
  *returnSize = 2;
  int left = 0, right = numbersSize - 1;

  while(left < right) {
    int total = numbers[left] + numbers[right];

    if(total == target) {
      int *arr = malloc(sizeof(int) * (*returnSize));

      arr[0] = left + 1;
      arr[1] = right + 1;

      return arr;
    } else if (total > target) {
      right--;
    } else {
      left++;
    }
  }

  return NULL;
}

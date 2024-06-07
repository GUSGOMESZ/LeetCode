int* twoSum(int *nums, int numsSize, int target, int *returnSize) {
  int *returnValue = malloc(3 * sizeof(int));
  memset(returnValue, 0, sizeof(int));

  for(int i = 0; i < numsSize; i++) {
    for(int j = i + 1; j < numsSize; j++) {
      if(nums[i] + nums[j] == target) {
        returnValue[0] = i;
        returnValue[1] = j;
        *returnSize = 2;
        return returnValue;
      }
    }
  }
  return returnSize;
}

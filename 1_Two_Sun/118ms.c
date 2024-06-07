int* twoSum(int *nums, int numsSize, int target, int *returnSize) {
  int *p = NULL;

  for(int i = 0; i < numsSize; i++) {
    for(int j = i + 1; j < numsSize; j++) {
      if(nums[i] + nums[j] == target) {
        p = (int*) malloc(2 * sizeof(int));
        p[0] = i;
        p[1] = j;
        *returnSize = 2;
      }
    }
  }
  
  return p;
}

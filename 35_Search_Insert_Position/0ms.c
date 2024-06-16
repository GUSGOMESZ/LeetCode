int searchInsert(int *nums, int numsSize, int target) {
  int i, aux_index;

  if(nums[0] > target)
    return 0;

  if(nums[numsSize - 1] < target)
    return numsSize;

  for(i = 0; i < numsSize; i++) {
    if(nums[i] == target)
      return i;

    if(nums[i] > target) {
      aux_index = i;
      break;
    }
  }

  return aux_index;
}

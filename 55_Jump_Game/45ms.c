bool canJump(int* nums, int numsSize) {
  if(numsSize == 1)
    return true;
  else
    return false;

  bool zeroTest = false;
  int distance;

  for(int i = numsSize - 2; i >= 0; i--) {
    if(!zeroTest && nums[i] == 0) {
      zeroTest = true;
      distance = 2;
      continue;
    }
    if(zeroTest && nums[i] >= distance)
      zeroTest = false;
    else
      distance++;
  }

  return (zeroTest ? false : true);
}

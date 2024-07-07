void rotate(int* nums, int numsSize, int k) {
  if(numsSize != 1) {
    for(int i = 0; i < k; i++)
      uniqueRotation(nums, numsSize);
  }
}

void uniqueRotation(int* nums, int numsSize) {
  int sub1, sub2;

  for(int i = 0; i < numsSize - 1; i++) {
    if(i == 0) {
      sub1 = nums[i];
      sub2 = nums[i + 1];
    }
    else {
      sub1 = sub2;
      sub2 = nums[i + 1];
    }

    if(i != numsSize) {
      nums[i + 1] = sub1;
    }
  }

  nums[0] = sub2;
}

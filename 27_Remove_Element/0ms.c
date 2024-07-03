// Mine

bool isOkay(int* nums, int k) {
  for(int i = 0; i < k; i++) {
    if(nums[i] == 95)
      return true;
  }
  return false;
}

int removeElement(int* nums, int numsSize, int val) {
  if(numsSize == 0)
    return 0;

  if(numsSize == 1 && val == nums[0])
    return 0;

  if(numsSize == 1 && val != nums[0])
    return 1;

  int cont = 0, k;

  for(int i = 0; i < numsSize; i++) {
    if(nums[i] == val) {
      cont++;
      nums[i] = 95;
    }
  }

  k = numsSize - cont;

  int first95Index, firstNo95Index, temp;

  while(isOkay(nums, k)) {
    for(int i = 0; i < k; i++) {
      if(nums[i] == 95) {
        first95Index = i;
        i = k;
      }
    }

    for(int i = k; i < numsSize; i++) {
      if(nums[i] != 95) {
        firstNo95Index = i;
        i = numsSize;
      }
    }

    temp = nums[first95Index];
    nums[first95Index] = nums[firstNo95Index];
    nums[firstNo95Index] = temp;
  }

  return k;
}

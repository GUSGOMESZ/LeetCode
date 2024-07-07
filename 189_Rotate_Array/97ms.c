void rotate(int* nums, int numsSize, int k) {
  int *aux = malloc(numsSize * sizeof(int));

  for(int i = 0; i < numsSize; i++) 
    aux[((i + k) % numsSize)] = nums[i];

  for(int i = 0; i < numsSize; i++)
    nums[i] = aux[i];
}

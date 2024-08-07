class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int left = 0, right = numbers.length - 1;
    int[] arr = new int[2];
    int total;

    while(left < right) {
      total = numbers[left] + numbers[right];

      if(total == target) {
        arr[0] = left + 1;
        arr[1] = right + 1;

        return arr;
      } else if(total > target) {
        right--;
      } else {
        else++;
      }
    }

    return null;
  }
}

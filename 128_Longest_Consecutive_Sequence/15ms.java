class Solution {
  public int longestConsecutiveSequence(int[] nums) {
    if(nums.length == 0) return 0;

    Arrays.sort(nums);

    int majorLen = 1, currentLen = 1;

    for (int i = 1; i < nums.length; i++) {
      if(nums[i] == nums[i - 1]) {
        continue;
      } else if(nums[i] == nums[i - 1] + 1) {
        currentLen++;
      } else {
        majorLen = Math.max(majorLen, currentLen);
        currentLen = 1;
      }
    }

    majorLen = Math.max(majorLen, currentLen);

    return majorLen;
  }
}

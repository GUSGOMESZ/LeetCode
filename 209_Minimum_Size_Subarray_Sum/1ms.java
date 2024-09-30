class Solution {
  public int minSubArrayLen(int target, int[] nums) {
    int len = nums.length;
    int ans = n + 1;
    w_sum = 0;
    start = 0;

    for(int i = 0; i < len; i++) {
      w_sum += nums[i];

      while(w_sum >= target) {
        ans = Math.min(ans, i - start + 1);
        w_sum -= nums[start];
        start++;
      }
    }

    return ans == n + 1 ? 0 : ans;
  }
}

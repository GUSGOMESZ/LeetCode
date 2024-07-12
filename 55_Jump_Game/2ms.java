class Solution {
  public boolean canJump(int[] nums) {
    if(nums.length == 1)
      return true;

    boolean flag = false;
    int cur = 0;

    for(int i = nums.length - 2; i >= 0; i--) {
      if(!flag && nums[i] == 0) {
        cur = 2;
        flag = true;
        continue;
      }
      if(flag && nums[i] >= cur)
        flag = false;
      else
        cur++
    }

    return (flag ? false : true);
  }
}

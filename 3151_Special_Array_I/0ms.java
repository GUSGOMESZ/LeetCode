class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length - 1;

        if(n == 0) return true;

        for(int i = 0; i < n; i++) {
            if((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) || (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0)) return false;
        }

        return true;
    }
}

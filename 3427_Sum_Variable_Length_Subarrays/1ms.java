class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int sum = nums[0];

        for(int i = 1; i < n; i++) {
            int start = Math.max(0, i - nums[i]), end = i;

            for(int j = start; j <= end; j++) {
                sum += nums[j];
            }
        }

        return sum;
    }
}

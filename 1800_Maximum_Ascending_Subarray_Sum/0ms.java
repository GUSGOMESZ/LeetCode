class Solution {
    public int maxAscendingSum(int[] nums) {

        int n = nums.length, auxSum = nums[0], sum = 0;

        for(int i = 1; i < n; i++) {
            if(nums[i] > nums[i - 1]) {
                auxSum += nums[i];
            } else {
                
                sum = Math.max(sum, auxSum);

                auxSum = nums[i];
            }
        }

        return Math.max(sum, auxSum);
    }
}

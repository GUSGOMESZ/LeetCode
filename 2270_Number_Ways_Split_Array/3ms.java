class Solution {
    public int waysToSplitArray(int[] nums) {
        
        int n = nums.length, validSplits = 0;
        long leftSum = 0, rightSum = 0;

        for(int num : nums) {
            rightSum += num;
        }

        for(int i = 0; i < n - 1; i++) {

            leftSum += nums[i];
            rightSum -= nums[i];

            if(leftSum >= rightSum) validSplits++;
        }

        return validSplits;
    }
}

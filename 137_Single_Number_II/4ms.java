class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1;) {

            if(nums[i] == nums[i + 1]) {
                i += 3;
            } else {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}

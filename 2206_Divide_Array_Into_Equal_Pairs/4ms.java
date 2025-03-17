class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i + 1] != nums[i]) return false;
            else i++;
        }

        return true;
    }
}

var majorityElement = function(nums) {
    nums.sort((a, b) => a - b);
    var n = nums.length;
    return nums[Math.floor(n/2)];
};

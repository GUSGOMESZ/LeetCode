var maxArea = function(height) {
    var left = 0;
    var right = height.length - 1;
    var area = 0;
    var currentArea = 0;

    while(left < right) {
        if(height[right] > height[left]) {
            area = (right - left) * height[left]; 
        } else {
            area = (right - left) * height[right];
        }

        if(area > currentArea) {
            currentArea = area;
        }

        if(height[right] > height[left]) {
            left++;
        } else {
            right--;
        }
    }

    return currentArea;
};

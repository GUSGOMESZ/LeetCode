class Solution {
  public int maxArea(int[] height) {
    int left = 0, right = height.length - 1, area = 0, currentArea = 0;

    while(left < right) {
      area = (right - left) * (height[right] > height[left] ? height[left] : height[right]);

      if(area > currentArea)
        currentArea = area;

      if(height[right] > height[left])
        left++;
      else
        right--;
    }

    return currentArea;
  }
}

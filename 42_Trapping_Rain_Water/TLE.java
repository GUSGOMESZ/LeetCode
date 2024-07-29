class Solution {
  public int trap(int[] height) {
    
    int major = height[0];

    for(int i = 1; i < height.length; i++) {
      if(height[i] > major) {
        major = height[i];
      }
    }

    int currentHeight, start, end, water = 0;

    for(int i = 0; i < major; i++) {
      currentHeight = i + 1;
      start = -1;
      end = -1;

      for(int j = 0; j < height.length; j++) {
        if(height[j] >= currentHeight) {
          start = j;
          break;
        }
      }

      for(int j = height.length - 1; j >= 0; j--) {
        if(height[j] >= currentHeight) {
          end = j;
          break;
        }
      }

      if (start == end) {
        continue;
      } else {
        water = water + (end - start - 1);

        for(int j = start + 1; j < end; j++) {
          if(height[j] >= currentHeight) {
            water -= 1;
          }
        }
      }
    }

    return water;
  }
}

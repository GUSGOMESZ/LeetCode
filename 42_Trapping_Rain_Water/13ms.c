int trap(int* height, int heightSize) {
    
    if(heightSize == 0) return 0;

    int left[heightSize];
    int right[heightSize];
    int water = 0;

    // left
    left[0] = height[0];
    for(int i = 1; i < heightSize; i++) {
        if(height[i] > left[i - 1]) {
            left[i] = height[i];
        } else {
            left[i] = left[i - 1];
        }
    }

    right[heightSize - 1] = height[heightSize - 1];
    for(int i = heightSize - 2; i >= 0; i--) {
        if(height[i] > right[i + 1]) {
            right[i] = height[i];
        } else {
            right[i] = right[i + 1];
        }
    }

    int minHeight = 0;

    for(int i = 0; i < heightSize; i++) {
        (left[i] > right[i] ? (minHeight = right[i]) : (minHeight = left[i]));
        water += minHeight - height[i];
    }

    return water;
}

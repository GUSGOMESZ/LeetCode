use std::cmp;

impl Solution {
    pub fn my_sqrt(x: i32) -> i32 {
        let mut low = 0;
        let mut high = cmp::min(x, 46340);

        while low <= high {
            let mid = low + (high-low)/2;
            if mid * mid == x {
                return mid;
            }
            else if mid * mid > x {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        high
    }
}

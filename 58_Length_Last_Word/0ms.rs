impl Solution {
    pub fn length_of_last_word(s: String) -> i32 {
        let mut len = 0;
        for c in s.trim_end().chars().rev() {
            if c == ' ' {
                return len;
            }
            len += 1;
        }
        len
    }
}

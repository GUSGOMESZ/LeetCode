class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int windowLen = 0;
        HashSet<Character> set = new HashSet<>();
        
        int i = 0, j = 0;
        while (j < len) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                windowLen = Math.max(windowLen, set.size());
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        return windowLen;
    }
}

class Solution {
    public int countPalindromicSubsequence(String s) {

        int[] right = new int[26];

        for(Character c : s.toCharArray()) {
            right[c - 'a']++;
        }

        int[] left = new int[26];
        HashSet<Integer> hash = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - 'a';
            right[t]--;

            for(int j = 0; j < 26; j++) {
                if(right[j] > 0 && left[j] > 0) {
                    hash.add(26 * t + j);
                }
            }

            left[t]++;
        }

        return hash.size();
    }
}

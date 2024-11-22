class Solution {
    public int[] diStringMatch(String s) {
        
        int permLen = s.length();
        int auxPerm = 0;
        int[] perm = new int[permLen + 1];
        int start = 0, end = permLen;

        for(int i = 0; i < permLen; i++) {
            if(s.charAt(i) == 'I') {
                perm[auxPerm++] = start++;
            } else {
                perm[auxPerm++] = end--;
            }
        }

        perm[auxPerm] = start;

        return perm;
    }
}

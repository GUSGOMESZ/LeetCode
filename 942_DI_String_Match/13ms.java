class Solution {
    public int[] diStringMatch(String s) {
        
        int permLen = s.length();

        ArrayList<Integer> range = new ArrayList<Integer>();

        for(int i = 0; i <= permLen; i++) {
            range.add(i);
        }

        int auxPerm = 0;
        int[] perm = new int[permLen + 1];

        for(int i = 0; i < permLen; i++) {
            if(s.charAt(i) == 'I') {
                perm[auxPerm++] = range.get(0);
                range.remove(0);
            } else {
                perm[auxPerm++] = range.get(range.size() - 1);
                range.remove(range.size() - 1);
            }
        }

        perm[auxPerm] = range.get(0);

        return perm;
    }
}

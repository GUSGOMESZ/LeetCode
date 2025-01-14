class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> al = new HashSet<>();
        int len = A.length;
        int[] ret = new int[len];

        for(int i = 0; i < len; i++) {
            int loader = 0;

            if(al.contains(A[i])) loader++; else al.add(A[i]);
            if(al.contains(B[i])) loader++; else al.add(B[i]);

            if(i != 0) ret[i] = ret[i - 1] + loader; else ret[i] = loader;
        }

        return ret;
    }
}

class Solution {
    public int[] minOperations(String boxes) {
        
        int len = boxes.length();
        char[] boxesStr = boxes.toCharArray();
        int[] ret = new int[len];

        for(int i = 0; i < len; i++) {

            int jumps = 0;

            for(int j = 0; j < len; j++) {

                if(j != i) {

                    if(boxesStr[j] == '1') {
                        jumps += Math.abs(j - i);
                    }
                }
            }

            ret[i] = jumps;
        }

        return ret;
    }
}

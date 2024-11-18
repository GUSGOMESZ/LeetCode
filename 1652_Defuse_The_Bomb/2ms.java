class Solution {
    public int[] decrypt(int[] code, int k) {

        int codeLen = code.length;

        if(k == 0) {
            
            for(int i = 0; i < codeLen; i++) {
                code[i] = 0;
            }

            return code;
        }

        if(k < 0) {

            int[] arr = new int[codeLen];

            k *= (-1);

            for(int i = 0; i < codeLen; i++) {

                int sum = 0, auxI = i - 1;

                for(int j = 0; j < k; j++) {
                    
                    if(auxI == -1) auxI = codeLen - 1;

                    sum += code[auxI];

                    auxI--;
                }

                arr[i] = sum;
            }

            return arr;
        }

        if(k > 0) {

            int[] arr = new int[codeLen];

            for(int i = 0; i < codeLen; i++) {

                int sum = 0, auxI = i + 1;

                for(int j = 0; j < k; j++) {
                    
                    if(auxI == (codeLen)) auxI = 0;

                    sum += code[auxI];

                    auxI++;
                }

                arr[i] = sum;
            }

            return arr;
        }

        return code;
    }
}

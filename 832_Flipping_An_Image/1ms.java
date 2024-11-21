class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i = 0; i < image.length; i++) {

            int[] current = image[i];
            int currentLen = current.length;

            for(int j = 0; j < currentLen / 2; j++) {
                int aux = current[currentLen - j - 1];
                current[currentLen - j - 1] = current[j];
                current[j] = aux;
            }

            for(int j = 0; j < currentLen; j++) {
                if(current[j] == 0) current[j] = 1;
                else current[j] = 0;
            }
        }

        return image;
    }
}

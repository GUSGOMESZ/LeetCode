class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int xor1 = 0, xor2 = 0;

        // XOR de todos os elementos de nums1
        for (int num : nums1) {
            xor1 ^= num;
        }

        // XOR de todos os elementos de nums2
        for (int num : nums2) {
            xor2 ^= num;
        }

        int result = 0;

        // Se nums2 tem tamanho ímpar, cada elemento de nums1 será usado len2 vezes
        if (len2 % 2 == 1) {
            result ^= xor1;
        }

        // Se nums1 tem tamanho ímpar, cada elemento de nums2 será usado len1 vezes
        if (len1 % 2 == 1) {
            result ^= xor2;
        }

        return result;
    }
}

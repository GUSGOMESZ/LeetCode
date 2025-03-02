class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n1 = nums1.length, n2 = nums2.length;

        for (int i = 0; i < n1; i++) {
            map.put(nums1[i][0], nums1[i][1]);
        }

        for (int i = 0; i < n2; i++) {
            if (!map.containsKey(nums2[i][0])) {
                map.put(nums2[i][0], nums2[i][1]);
            } else {
                map.put(nums2[i][0], map.get(nums2[i][0]) + nums2[i][1]);
            }
        }

        int[][] result = new int[map.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[index][0] = entry.getKey();
            result[index][1] = entry.getValue();
            index++;
        }

        Arrays.sort(result, (a, b) -> Integer.compare(a[0], b[0]));

        return result;
    }
}

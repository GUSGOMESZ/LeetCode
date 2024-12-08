class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        ArrayList<Integer> x = new ArrayList<>(), y = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            x.add(nums[i]);
            y.add(nums[i + n]);
        }

        int[] shuf = new int[nums.length];
        int auxIndex = 0;

        for(int i = 0; i < n; i++, auxIndex += 2) {

            shuf[auxIndex] = x.get(i);
            shuf[auxIndex + 1] = y.get(i);
        }

        return shuf;
    }
}

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] tempCharArray = new int[26];
        int[] maxCharArray = new int[26];

        for(String str2 : words2) {
            Arrays.fill(tempCharArray, 0);

            for(Character c : str2.toCharArray()) {
                tempCharArray[c - 'a']++;
            }

            for(int i = 0; i < 26; i++) {
                maxCharArray[i] = Math.max(maxCharArray[i], tempCharArray[i]);
            }
        }

        ArrayList<String> lst = new ArrayList<>();

        for(String str1 : words1) {
            Arrays.fill(tempCharArray, 0);

            for(Character c : str1.toCharArray()) {
                tempCharArray[c - 'a']++;
            } 

            boolean isUniversal = true;

            for(int i = 0; i < 26; i++) {
                if(tempCharArray[i] < maxCharArray[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if(isUniversal) lst.add(str1);
        } 

        return lst;
    }
}

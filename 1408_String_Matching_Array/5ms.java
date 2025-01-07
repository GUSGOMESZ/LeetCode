class Solution {
    public List<String> stringMatching(String[] words) {
        
        int wordLen = words.length;
        List<String> lst = new ArrayList<>();

        for(String word : words) {

            for(int i = 0; i < wordLen; i++) {

                if(word.length() < words[i].length()) {
                    if(words[i].contains(word)) {
                        lst.add(word);
                        break;
                    }
                }
            }
        }

        return lst;
    }
}

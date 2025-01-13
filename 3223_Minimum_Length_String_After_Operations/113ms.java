class Solution {
    public int minimumLength(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] ca = s.toCharArray();

        for(char c : ca) {
            if(hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        int len = 0;

        for(Integer value : hm.values()) {
            if(value > 2)  {
                if(value % 2 != 0) len += 1;
                else len += 2;
            } else {
                len += value;
            }
        }

        return len;
    }
}

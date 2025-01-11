class Solution {
    public boolean canConstruct(String s, int k) {
        
        if(s.length() < k) return false;
        if(s.length() == k) return true;

        HashMap<Character, Integer> hs = new HashMap<>();
        char[] ca = s.toCharArray();

        for(char c : ca) {

            if(hs.containsKey(c)) {
                hs.put(c, hs.get(c) + 1);
            } else {
                hs.put(c, 1);
            }
        }

        int oddQtt = 0;

        for(Integer value : hs.values()) {
            if(value % 2 != 0) oddQtt++;
        }
    
        return (oddQtt <= k);
    }
}

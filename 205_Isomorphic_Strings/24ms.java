class Solution {
  public boolean isIsomorphic(String s, String t) {
    HashMap<Character, Character> hm1 = new HashMap<>();
    HashMap<Character, Character> hm2 = new HashMap<>();

    for(int i = 0; i < s.length(); i++) {
      if(hm1.containsKey(s.charAt(i))) {
        if(t.charAt(i) != hm1.get(s.charAt(i))) {
          return false;
        }
      } else {
        if(hm2.containsKey(t.charAt(i))) {
          return false;
        }
      }

      hm1.put(s.charAt(i), t.charAt(i));
      hm2.put(t.charAt(i), s.charAt(i));
    }

    return true;
  }
}

class Solution {
  public boolean wordPattern(String pattern, String s) {
    String arr[] = s.split(" ");

    if(arr.length != pattern.length()) {
      return false;
    }

    HashMap<Character, String> mp = new HashMap<>();

    for(int i = 0; i < pattern.length(); i++) {
      char ch = pattern.charAt(i);

      if(mp.containsKey(ch)) {
        if(!mp.get(ch).equals(arr[i])) {
          return false;
        }
      } else {
        if(mp.containsValue(arr[i])) {
          return false;
        }

        mp.put(ch, arr[i]);
      }
    }

    return true;
  }
}

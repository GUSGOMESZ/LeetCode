class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count = 0;

        for(List<String> lst : items) {

            String value = "";

            if (ruleKey.equals("type")) value = lst.get(0);
            else if (ruleKey.equals("color")) value = lst.get(1);
            else if (ruleKey.equals("name")) value = lst.get(2);


            if(value.equals(ruleValue)) count++;
        }

        return count;
    }
}

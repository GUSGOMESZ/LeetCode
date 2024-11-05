class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        ArrayList<String> input = new ArrayList<>(Arrays.asList(strs));
        List<List<String>> list = new ArrayList<>();

        while(!input.isEmpty()) {

            List<String> eachList = new ArrayList<>();
            String base = input.get(0);
            eachList.add(base);
            input.remove(0);

            for(int i = input.size() - 1; i >= 0; i--) {

                if(compare(base, input.get(i))) {
                    eachList.add(input.get(i));
                    input.remove(i);  
                }
            }

            list.add(eachList);
        }

        return list;
    }

    public boolean compare(String string1, String string2) {

        char[] auxString1 = string1.toCharArray();
        char[] auxString2 = string2.toCharArray();

        Arrays.sort(auxString1);
        Arrays.sort(auxString2);

        return Arrays.equals(auxString1, auxString2);
    }
}

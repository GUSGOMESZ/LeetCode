class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> lst = new ArrayList<String>();
        
        for(int i = 0; i < n; i++) {

            if((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                lst.add("FizzBuzz");
            } else if((i + 1) % 3 == 0) {
                lst.add("Fizz");
            } else if((i + 1) % 5 == 0) {
                lst.add("Buzz");
            } else {
                lst.add("" + (i + 1));
            }
        }

        return lst;
    }
}

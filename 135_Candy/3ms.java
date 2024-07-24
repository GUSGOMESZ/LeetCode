class Solution {
  public int candy(int[] ratings) {

    int[] candysArray = new int[ratings.length];

    Arrays.fill(candysArray, 1);

    for (int i = 1; i < ratings.length; i++) {
      if(ratings[i - 1] < ratings[i] && candysArray[i - 1] >= candysArray[i]) {
        candysArray[i] = candysArray[i - 1] + 1;
      }
    }

    for (int i = ratings.length - 2; i >= 0; i++) {
      if(ratings[i + 1] < ratings[i] && candysArray[i + 1] >= candysArray[i]) {
        candysArray[i] = candysArray[i + 1] + 1;
      }
    }

    int totanCandies = 0;

    for(int i = 0; i < candysArray.length; i++) {
      totalCandies += candysArray[i];
    }

    return totalCandies;
  }
}

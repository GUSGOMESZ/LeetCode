int maxProfit(int* prices, int pricesSize) {
  if (pricesSize == 1)
    return 0;

  int maxProfit = 0, currentProfit = 0;

  for(int i = 0; i < pricesSize - 1; i++) {
    for(int j = i + 1; j < pricesSize; j++) {
      if(prices[i] < prices[j]) {
        currentProfit = (prices[j] - prices[i]);
      }

      if(currentProfit > maxProfit) {
        maxProfit = currentProfit;
      }
    }
  }

  return maxProfit;
}

int maxProfit(int* prices, int pricesSize) {
  int buyingPrice = prices[0], maxProfit = 0;

  for(int i = 1; i < pricesSize; i++) {
    if (prices[i] < buyingPrice) {
      buyingPrice = prices[i];
    }
    else if (prices[i] - buyingPrice > maxProfit) {
      maxProfit = prices[i] - buyingPrice;
    }
  }

  return maxProfit;
}

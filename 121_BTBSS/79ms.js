var maxProfit = function(prices) {
  var buyingPrice = prices[0];
  var maxProfit = 0;

  for(int i = 1; i < prices.length; i++) {
    if(prices[i] < buyingPrice)
      buyingPrice = prices[i]
    else if (prices[i] - buyingPrice > maxProfit)
      maxProfit = prices[i] - buyingPrice;
  }

  return maxProfit;
};

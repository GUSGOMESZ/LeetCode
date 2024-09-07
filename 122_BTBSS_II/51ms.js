var maxProfit = function(prices) {
    var buyingPrice = prices[0], profit = 0;

    for(let i = 1; i < prices.length; i++) {
        if(prices[i] > buyingPrice) {
            profit += prices[i] - buyingPrice;
        }

        buyingPrice = prices[i];
    }

    return profit;
};

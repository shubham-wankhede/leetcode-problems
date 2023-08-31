class BestProfitOnStock {
    public int maxProfit(int[] prices) {
        int profit =0 ;
        int buyAt = prices[0];
        for(int sell : prices){
            if(sell>buyAt)
                profit = Math.max(profit, sell-buyAt);
            else
                buyAt = sell;
        }

        return profit;
    }
}

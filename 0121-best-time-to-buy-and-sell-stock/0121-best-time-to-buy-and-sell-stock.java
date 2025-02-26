class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            int p = 0;
            if(buy>prices[i]){
                buy = prices[i];
            }
            else{
                p = prices[i]-buy;
            }
            profit = Math.max(p, profit);

        }
        return profit;
    }
}
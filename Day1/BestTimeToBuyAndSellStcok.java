// tc - O(N)
// sc - O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int buy = prices[0];
        int maxProfit = 0;

        for(int i =0;i < n;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else if(prices[i] - buy > maxProfit){
                maxProfit = prices[i]-buy;
            }
        }

        return maxProfit;
    }
}
// Greedy
// tc - O(N)
// sc - O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i =0; i < n;i++){
            if(prices[i]>min_value){
                max_profit = max_profit + prices[i] - min_value;
            }   
            min_value = prices[i];
            
        }
        return max_profit;
    }
}

// Tle solution
// tc - 2^N
// sc - O(N)
class Solution {
    public int maxProfit(int[] prices) {
        return helper(0,1,prices);
    }

    int helper(int idx,int buy,int[] prices){
        if(idx == prices.length) return 0;

        int profit = 0;
        if(buy == 1){
            profit = Math.max(-prices[idx] + helper(idx+1,0,prices),helper(idx+1,1,prices));
        }else{
            profit += Math.max(prices[idx] + helper(idx+1,1,prices),helper(idx+1,0,prices));
        }

        return profit;
    }
}

// memoization solution
// tc - O(N*2)
// sc - O(N*2) + O(N)
class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        
        return helper(0,1,prices,dp);
    }

    int helper(int idx,int buy,int[] prices,int[][] dp){
        if(idx == prices.length) return 0;

        if(dp[idx][buy] != -1) return dp[idx][buy];
        int profit = 0;
        if(buy == 1){
            profit = Math.max(-prices[idx] + helper(idx+1,0,prices,dp),helper(idx+1,1,prices,dp));
        }else{
            profit += Math.max(prices[idx] + helper(idx+1,1,prices,dp),helper(idx+1,0,prices,dp));
        }

        return dp[idx][buy] = profit;
    }
}

// Tabulation
// tc - O(N*2)
// sc - O(N*2)
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        dp[n][0] = 0;
         dp[n][1] = 0;

         for(int idx = n-1;idx >= 0;idx--){
            for(int buy = 0;buy <= 1;buy++){
                       int profit = 0;
        if(buy == 1){
            profit = Math.max(-prices[idx] + dp[idx+1][0],dp[idx+1][1]);
        }else{
            profit += Math.max(prices[idx] +dp[idx+1][1],dp[idx+1][0]);
        }

      dp[idx][buy] = profit;
            }
         }
        
        return dp[0][1];
    }

  
}


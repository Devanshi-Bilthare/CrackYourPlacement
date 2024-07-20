// Brute force 
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n =gas.length;

        for(int i =0;i < n;i++){
            if(gas[i] < cost[i]) continue;

            int j = (i+1)%n;
            int curgas = gas[i] - cost[i] + gas[j];
            while(j != i){
                if(curgas < cost[j]) break;

                int costmove = cost[j];
                j = (j+1)%n;
                int gasEarned = gas[j];
                curgas = curgas - costmove + gasEarned;
            }

            if(j == i) return i;
        }


        return -1;
    }
}

// greedy
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {   
        int n =gas.length;
        int gasEarned = 0;
        int gasCost = 0;
        for(int i =0;i < n;i++){
            gasEarned += gas[i];
            gasCost += cost[i];
        }

        if(gasCost > gasEarned) return -1;

        int total =0;
        int  res = 0;

        for(int i =0;i < n;i++){
            total = total + gas[i]-cost[i];
            if(total < 0) {
                total = 0;
                res = i+1;
            }
        }

        return res;
    }
}
// brute solution
// tc - o(N^2)
// sc - O(1)
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int i =0;i < n;i++){
            int sum = 0;
            for(int j =i;j < n;j++){
                sum += nums[j];
                if(sum == k) ans++;
            }

        }

        return ans;

    }
}
// optimal solution
// tc - O(N * logN)
// sc - O(N)
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap();  
        map.put(0,1);   
    
        int cnt=0;
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                cnt+=map.get(sum-k);
            } 
            map.put(sum,map.getOrDefault(sum,0)+1);
        }   
        return cnt; 
        
    }
}
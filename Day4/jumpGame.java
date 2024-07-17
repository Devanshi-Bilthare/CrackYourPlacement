// tle solution
class Solution {
    public boolean canJump(int[] nums) {
        
        return helper(0,nums);
    }

    boolean helper(int idx,int[] nums){
        if(idx >= nums.length-1) return true;

        for(int i =1;i <= nums[idx];i++){
           if( helper(idx + i,nums)) return true;
        }

        return false;
    }
}


// dp solution
class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        Arrays.fill(dp, true);
        return helper(0,nums,dp);
    }

    boolean helper(int idx,int[] nums,boolean [] dp){
        if(idx >= nums.length-1) return true;

        if(!dp[idx]) return false;

        for(int i =1;i <= nums[idx];i++){
           if( helper(idx + i,nums,dp)) return true;
        }

        return dp[idx] = false;
    }
}

//optimized
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int cnt = 0;

        for(int i =0; i < n;i++){
            if(i > cnt) return false;
            cnt = Math.max(cnt,i + nums[i]);
        }

        return true;
    }
}
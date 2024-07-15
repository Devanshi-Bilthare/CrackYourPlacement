// best approach
// tc - O(N)
// sc - O(K)
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int n = nums.length;
       int[] freq = new int[k];
       int ans = 0;
       freq[0] = 1;

        int sum = 0;
        int rem = 0;
       for(int i =0;i < n;i++){
        sum += nums[i];
        rem = sum % k;
        if(rem < 0) rem = rem + k;
        if(freq[rem] > 0){
            ans += freq[rem];
        }

        freq[rem]++;
       }

       return ans;
    }
}


// brute Tle solution
// approach 1 using extar funtion 
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int n = nums.length;
       int ans = 0;

       for(int i =0;i < n;i++){
        for(int j = i;j < n;j++){
            int sum = getSum(i,j,nums);
            if(sum % k == 0){
                ans++;
            }
        }
       }

       return ans;
    }

    int getSum(int i,int j,int[] nums){
        int sum = 0;
        for(int k =i;k <= j;k++){
            sum += nums[k];
        }

        return sum;
    }
}

// approach 2 
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int n = nums.length;
       int ans = 0;

       for(int i =0;i < n;i++){
        int sum = 0;
        for(int j = i;j < n;j++){
            sum += nums[j];
            if(sum % k == 0){
                ans++;
            }
        }
       }

       return ans;
    }
}
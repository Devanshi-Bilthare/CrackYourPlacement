// Taking extra space
// tc - O(N)
// sc - O(N)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j =0;

        for(int i =0;i < n-1;i++){
            if(nums[i] != nums[i+1]){
                ans[j] = nums[i];
                j++;
            }
        }

        ans[j] = nums[n-1];


        for(int i = 0;i < n;i++){
            nums[i] = ans[i];
        }

        return j+1;

    }
}

// optimized approach
// tc - O(N)
// sc - O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;

        for(int i =0;i < n-1;i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
        }

        nums[j] = nums[n-1];


        return j+1;

    }
}
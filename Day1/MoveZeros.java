// In Place solution
// sc - O(N)
// tc - O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j =0;
        for(int i =0;i < n;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        for(int i =j;i < n;i++){
            nums[i] = 0;
        }
    }
}
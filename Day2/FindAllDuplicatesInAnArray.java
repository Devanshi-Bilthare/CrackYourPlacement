// tc - O(N)
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0;i < n;i++){
             int idx = Math.abs(nums[i]) -1;
            if(nums[idx] < 0) list.add(idx+1);
            else{
               
                nums[idx] = -nums[idx];
            } 
        }

        return list;
    }
}
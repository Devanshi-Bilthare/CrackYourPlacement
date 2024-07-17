class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listSet = new HashSet<>();
        
        int i =0;
       while(i < nums.length){
         Set<Integer> set = new HashSet<>();
         int j = i+1;
         while(j < nums.length){
            int rem = -(nums[i] + nums[j]);
            if(set.contains(rem)){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(rem);

                Collections.sort(list);
                listSet.add(list);
            }
            set.add(nums[j]);
            j++;
        }
        i++;
       }

        List<List<Integer>> ans = new ArrayList<>(listSet);
        return ans;
    }
}
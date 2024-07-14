// Brute force
// tc - O(N^2)
// sc - O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i =0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}


// aproach 2
// tc - O(N)
// sc - O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i < n;i++){
            map.put(nums[i],i);
        }

        for(int i =0;i < n;i++){
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                int idx = map.get(rem);
                if(idx == i) continue;
                return new int[]{i,idx};
            }
        }


        return new int[]{-1,-1};
    }
}
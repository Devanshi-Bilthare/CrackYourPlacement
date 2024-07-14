// tle solution
class Solution {
    public int findDuplicate(int[] nums) {
      int n = nums.length;

      for(int i =1;i < n;i++){
        int cnt = 0;
        for(int j =0;j < n;j++){
            if(nums[j] == i)cnt++;
        }

        if(cnt >= 2) return i;
      }
       

       return -1;
    }
}

// Brute Force modifying the array
// tc - O(NlogN)
// sc - O(1)
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;

        Arrays.sort(nums);
        for(int i =0;i < n-1;i++){
            if(nums[i] == nums[i+1]){
                ans = nums[i];
                break;
            }
            
        }

        return ans;
    }
}

// 2nd approach using extra space 
// tc - O(N)
// sc - O(N)
class Solution {
    public int findDuplicate(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();

       for(int num:nums){
        if(map.containsKey(num)){
            return num;
        }
        map.put(num,map.getOrDefault(num,0)+1);
       }

        return -1;
       
    }
}

// best approach Linked List Cycle method
// tc - O(n)
// sc - O(1)

class Solution {
    public int findDuplicate(int[] nums) {
      int slow = nums[0];
      int fast = nums[0];

      do{
        slow = nums[slow];
        fast = nums[nums[fast]];
      }while(slow != fast);

      fast = nums[0];
      while(slow != fast){
        slow = nums[slow];
        fast = nums[fast];
      }

      return fast;
    }
}
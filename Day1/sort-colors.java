// Bubble sort
// tc - O(N^2)
class Solution {
    public void sortColors(int[] nums) {
       int n =nums.length;

       for(int i =0;i < n;i++){
        int min = i;

        for(int j = i+1;j < n;j++){
            if(nums[j] < nums[min]) min = j;
        }

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
       }
        
    }
}

// optimized approach
// tc - O(N)
// sc - O(1)

class Solution {
    public void sortColors(int[] nums) {
     int n = nums.length;
     int zero = 0;
     int one = 0;
     int two = n-1;

     while(one <= two){
        if(nums[one] == 0){
            int temp = nums[one];
            nums[one] = nums[zero];
            nums[zero] = temp;
            zero++;
            one++;
        }else if(nums[one] == 1){
            one++;
        }else{
            int temp = nums[one];
            nums[one] = nums[two];
            nums[two] = temp;
            two--;
        }
     }
    }
}

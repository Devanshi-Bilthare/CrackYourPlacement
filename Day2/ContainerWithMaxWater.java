// two pointer
// tc - O(N)
// sc - O(1)
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int st =0;
        int end = n-1;

        int max = 0;

        while(st < end){
            int contain = 0;
            if(height[st] <= height[end]){
                contain = height[st] * (end-st);
                st++;
            }else{
                contain = height[end] * (end-st);
                end--;
            }

            max = Math.max(max,contain);
        }

        return max;
    }
}
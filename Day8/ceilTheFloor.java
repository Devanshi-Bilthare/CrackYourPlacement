// problem link : https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int low = 0;
        int high = arr.length - 1;
        int floor = -1;
        
        while(low <= high){
            int mid = (low + high)/2;
            
            if(arr[mid] == x) return new int[]{x,x};
            
            if(arr[mid] < x){
                floor = arr[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        low = 0;
        high = arr.length -1;
        int ceil = -1;
         while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > x){
                ceil = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        
        return new int[] {floor,ceil};
    }
}

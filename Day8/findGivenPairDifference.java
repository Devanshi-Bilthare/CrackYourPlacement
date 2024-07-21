// problem link : https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1
class Solution {
    public int findPair(int n, int x, int[] arr) {
        Arrays.sort(arr);
        
        int i = 0;
        int j = 0;
        
        while(i < n && j < n){
            if(i != j && arr[j] - arr[i] == x) return 1;
            
            if(arr[j]-arr[i] > x) i++;
            else j++;
        }
        
        
        return -1;
    }
    
}
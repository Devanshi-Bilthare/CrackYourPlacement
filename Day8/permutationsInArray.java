class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i =0;i < n;i++){
            if(a[i] + b[n-i-1] < k) return false;
        }
        
        
        return true;
    }
}
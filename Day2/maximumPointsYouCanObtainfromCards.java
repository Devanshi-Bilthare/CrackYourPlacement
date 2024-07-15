class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        int result = leftSum;
        
        for(int i = 0; i < k; i++){
            leftSum -= cardPoints[k - i - 1];
            rightSum += cardPoints[n - i - 1];
            result = Math.max(leftSum + rightSum, result);
        }
        
        return result;
    }
    
}
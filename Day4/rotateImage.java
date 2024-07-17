class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = n;

        for(int c = 0; c < n;c++){
            int st = 0;
            int end = n-1;
            while(st <= end){
                int temp = matrix[st][c];
                matrix[st][c] = matrix[end][c];
                matrix[end][c] = temp;
                st++;
                end--;
            }
        }

        for(int r = 0; r < n;r++){
            for(int c = r; c < n;c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
    }
}
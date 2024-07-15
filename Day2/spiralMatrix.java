// tc - O(N*M)
// sc - O(N*M)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = m-1;
        int top = 0;
        int bot = n-1;

        while(left <= right && top <= bot){
           for(int i =left;i <= right;i++){
            list.add(matrix[top][i]);
           }
           top++;

           for(int i = top;i <= bot;i++){
            list.add(matrix[i][right]);
           }

           right--;

           if(!(top <= bot && left <= right)){ 
            break;  
            }

           for(int i = right;i >= left;i--){
            list.add(matrix[bot][i]);
           }
           bot--;
           for(int i = bot; i >= top;i--){
            list.add(matrix[i][left]);
           }
           left++;
        }

        return list;
    }
}
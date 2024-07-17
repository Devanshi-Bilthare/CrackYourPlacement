class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m];

        boolean res = false;

        for(int i =0;i < n;i++){
            for(int j =0;j < m;j++){
                if(word.charAt(0) == board[i][j]){
                    res = helper(i,j,n,m,board,word,0,vis);
                    if(res) return true;
                }
            }
        }


        return false;  
    }

    boolean helper(int i, int j,int n, int m, char[][] board, String word,int idx, boolean[][] vis){
        if(idx == word.length()) return true;

        if(i >= n || j >= m || i < 0 || j < 0 || vis[i][j] || board[i][j] != word.charAt(idx)) return false;

        vis[i][j] = true;

        if(helper(i+1,j,n,m,board,word,idx+1,vis) || helper(i-1,j,n,m,board,word,idx+1,vis) || 
            helper(i,j+1,n,m,board,word,idx+1,vis) || helper(i,j-1,n,m,board,word,idx+1,vis)
        ) return true;

        vis[i][j] = false;
        return false;
    }
}
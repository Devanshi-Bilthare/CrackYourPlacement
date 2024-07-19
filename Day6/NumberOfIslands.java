class Solution {
    void dfs(int r,int c, int[][] vis, char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        vis[r][c] = 1;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,-1,0,1};

        for(int i =0; i< 4;i++){
            int nrow = r+drow[i];
            int ncol = c + dcol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1'){
                dfs(nrow,ncol,vis,grid);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][]vis = new int[n][m];
        int islands =0;

        for(int i =0;i < n;i++){
            for(int j = 0; j < m;j++){
                if(vis[i][j] == 0 && grid[i][j] == '1'){
                    dfs(i,j,vis,grid);
                    islands++;
                }
            }
        }

        return islands;
    }
}